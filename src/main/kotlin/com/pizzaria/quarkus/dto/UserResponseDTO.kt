package com.pizzaria.quarkus.dto

import com.pizzaria.quarkus.model.User

data class UserResponseDTO(
    val id: Long,
    val nome: String,
    val sobrenome: String,
    val cpf: String
) {
    companion object{
        fun valueOf(user: User): UserResponseDTO {
            return UserResponseDTO(
                id = user.id,
                nome = user.nome ?: "",
                sobrenome = user.sobrenome ?: "",
                cpf = user.cpf ?: ""
            )
        }
    }
}