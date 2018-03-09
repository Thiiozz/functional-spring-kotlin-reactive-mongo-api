package fr.thiiozz.functional

import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.bodyToMono
import org.springframework.web.reactive.function.server.bodyToServerSentEvents

class FruitHandler(private val service: FruitService) {
    fun insert(req: ServerRequest) = ok().bodyToServerSentEvents(service.insert(req.bodyToMono()))
    fun findAll(req: ServerRequest) = ok().bodyToServerSentEvents(service.findAll())
    fun find(req: ServerRequest) = ok().bodyToServerSentEvents(service.findByName(req.pathVariable("name")))
    fun delete(req: ServerRequest) = ok().bodyToServerSentEvents(service.deleteByName(req.pathVariable("name")))
}