package com.pizzaria.quarkus.model

import io.quarkus.hibernate.orm.panache.PanacheEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User : PanacheEntity() {
    var nome: String? = null
    var sobrenome: String? = null
    @Column(length = 11)
    var cpf: String? = null
}