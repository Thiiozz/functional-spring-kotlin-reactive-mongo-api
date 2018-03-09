package fr.thiiozz.functional


import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FruitRepository : ReactiveMongoRepository<Fruit, String>