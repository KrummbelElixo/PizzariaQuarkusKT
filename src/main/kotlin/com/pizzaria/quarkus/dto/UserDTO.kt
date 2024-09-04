package com.pizzaria.quarkus.dto

data class UserDTO (
    val id: Long,
    val nome: String,
    val sobrenome: String,
    val cpf: String
)