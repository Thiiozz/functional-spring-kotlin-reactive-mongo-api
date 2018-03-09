package fr.thiiozz.functional

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

fun beans() = beans {
    bean<FruitHandler>()
    bean {
        FruitRouter(ref()).router()
    }
}

// See application.properties context.initializer.classes entry
class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) =
            beans().initialize(context)

}