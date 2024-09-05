package com.pizzaria.quarkus.repository

import com.pizzaria.quarkus.model.User
import io.quarkus.hibernate.orm.panache.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheRepository<User> {
}