package com.pizzaria.quarkus.repository

import com.pizzaria.quarkus.model.Pizza
import io.quarkus.hibernate.orm.panache.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class PizzaRepository : PanacheRepository<Pizza> {

}