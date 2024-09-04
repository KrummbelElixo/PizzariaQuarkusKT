package com.pizzaria.quarkus.dto

import com.pizzaria.quarkus.model.Pizza

data class PizzaResponseDTO(
    val id: Long,
    val nome: String,
    val descricao: String,
) {
    companion object {
        fun valueOf(pizza: Pizza): PizzaResponseDTO {
            return PizzaResponseDTO(
                id = pizza.id,
                nome = pizza.nome ?: "",
                descricao = pizza.descricao ?: ""
            )
        }
    }
}