package fr.thiiozz.functional

import org.springframework.web.reactive.function.server.router

class FruitRouter(private val fruitHandler: FruitHandler) {

    fun router() = router {
        "/api".nest {
            POST("/fruit", fruitHandler::insert)
            GET("/fruits", fruitHandler::findAll)
            GET("/fruit/{name}", fruitHandler::find)
            DELETE("/fruit/{name}", fruitHandler::delete)
        }
    }
}