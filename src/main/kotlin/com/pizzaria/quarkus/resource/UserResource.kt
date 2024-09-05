package com.pizzaria.quarkus.resource

import com.pizzaria.quarkus.dto.UserDTO
import com.pizzaria.quarkus.service.UserService
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.core.Response.Status

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
class UserResource {
    @Inject
    lateinit var userService: UserService

    @POST
    fun create(dto: UserDTO): Response {
        return Response
            .ok(Status.CREATED)
            .entity(userService.create(dto))
            .build()
    }

    @GET
    @Path("/{id}")
    fun findById(@PathParam("id") id: Long): Response {
        return Response
            .ok(userService.findById(id))
            .build()
    }
}