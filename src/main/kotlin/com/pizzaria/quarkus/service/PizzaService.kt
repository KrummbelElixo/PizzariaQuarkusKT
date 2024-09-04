package com.pizzaria.quarkus.service

import com.pizzaria.quarkus.dto.PizzaDTO
import com.pizzaria.quarkus.dto.PizzaResponseDTO
import com.pizzaria.quarkus.model.Pizza
import com.pizzaria.quarkus.repository.PizzaRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.transaction.Transactional

@ApplicationScoped
class PizzaService {
    @Inject
    lateinit var pizzaRepository: PizzaRepository

    @Transactional
    fun create(dto: PizzaDTO): PizzaResponseDTO {
        val pizza = Pizza()
        pizza.nome = dto.nome
        pizza.descricao = dto.descricao

        pizzaRepository.persist(pizza)
        return PizzaResponseDTO.valueOf(pizza)
    }

    @Transactional
    fun delete(id: Long) {
        pizzaRepository.deleteById(id)
    }

    fun findById(id: Long): PizzaResponseDTO {
        val pizza = pizzaRepository.findById(id)

        return PizzaResponseDTO.valueOf(pizza)
    }

    fun findAll(): List<PizzaResponseDTO> {
        return pizzaRepository
            .listAll()
            .map { PizzaResponseDTO.valueOf(it) }
            .toList()
    }
}