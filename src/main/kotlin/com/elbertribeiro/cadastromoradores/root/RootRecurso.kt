package com.elbertribeiro.cadastromoradores.root

import com.elbertribeiro.cadastromoradores.usuario.UsuarioRecurso
import io.swagger.v3.oas.annotations.Operation
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootRecurso {
    @Operation(summary = "Listar todas as collections")
    @GetMapping
    fun getEntryPoint(): ResponseEntity<RootDTO> {
        val rootEntryPoint = RootDTO()
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