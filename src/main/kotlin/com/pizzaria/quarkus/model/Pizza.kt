package com.pizzaria.quarkus.model

import io.quarkus.hibernate.orm.panache.PanacheEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "pizzas")
class Pizza() : PanacheEntity() {
    var nome: String? = null
    var descricao: String? = null
}