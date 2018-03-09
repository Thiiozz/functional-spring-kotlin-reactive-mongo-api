package fr.thiiozz.functional

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class FruitService(private val repository: FruitRepository) {
    fun insert(f: Mono<Fruit>) = repository.insert(f)
    fun findAll() = repository.findAll()
    fun findByName(name: String) = repository.findById(name)
    fun deleteByName(name: String) = repository.deleteById(name)
}