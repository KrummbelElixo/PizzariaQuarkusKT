package com.pizzaria.quarkus.service

import com.pizzaria.quarkus.dto.UserDTO
import com.pizzaria.quarkus.dto.UserResponseDTO
import com.pizzaria.quarkus.model.User
import com.pizzaria.quarkus.repository.UserRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.transaction.Transactional

@ApplicationScoped
class UserService {
    @Inject
    lateinit var userRepository: UserRepository

    @Transactional
    fun create(dto: UserDTO): UserResponseDTO {
        val user = User()
        user.nome = dto.nome
        user.sobrenome = dto.sobrenome
        user.cpf = dto.cpf

        userRepository.persist(user)
        return UserResponseDTO.valueOf(user)
    }

    fun findById(id: Long): UserResponseDTO {
        val user = userRepository.findById(id)

        return UserResponseDTO.valueOf(user)
    }
}