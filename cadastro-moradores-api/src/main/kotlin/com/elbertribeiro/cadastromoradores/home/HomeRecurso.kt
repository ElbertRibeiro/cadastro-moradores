package com.elbertribeiro.cadastromoradores.home

import com.elbertribeiro.cadastromoradores.usuario.UsuarioRecurso
import io.swagger.v3.oas.annotations.Operation
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeRecurso {
    @Operation(summary = "Listar todas as collections")
    @GetMapping
    fun getEntryPoint(): ResponseEntity<HomeDto> {
        val rootEntryPoint = HomeDto()
            .add(
                linkTo(
                    methodOn(UsuarioRecurso::class.java)
                        .listaUsuarios()
                )
                    .withRel("lista-usuarios")
            )

        return ResponseEntity.ok(rootEntryPoint)
    }
}