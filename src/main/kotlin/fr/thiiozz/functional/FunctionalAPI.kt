package fr.thiiozz.functional

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunctionalAPI

fun main(args: Array<String>) {
    runApplication<FunctionalAPI>(*args)
}
