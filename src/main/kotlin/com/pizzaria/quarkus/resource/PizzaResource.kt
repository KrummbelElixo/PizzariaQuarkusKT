package com.pizzaria.quarkus.resource

import com.pizzaria.quarkus.dto.PizzaDTO
import com.pizzaria.quarkus.service.PizzaService
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.core.Response.Status

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/pizzas")
class PizzaResource {
    @Inject
    lateinit var pizzaService: PizzaService

    @GET
    @Path("/{id}")
    fun findById(@PathParam("id") id: Long): Response {
        return Response
            .ok(pizzaService.findById(id))
            .build()
    }

    @GET
    fun findAll(): Response {
        return Response
            .ok(pizzaService.findAll())
            .build()
    }

    @POST
    fun create(dto: PizzaDTO): Response {
        return Response.status(Status.CREATED)
            .entity(pizzaService.create(dto))
            .build()
    }
}