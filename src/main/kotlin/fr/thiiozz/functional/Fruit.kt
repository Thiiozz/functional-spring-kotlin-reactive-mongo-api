package fr.thiiozz.functional

import org.springframework.data.annotation.Id

data class Fruit(@Id val name: String, var quantity: Int)