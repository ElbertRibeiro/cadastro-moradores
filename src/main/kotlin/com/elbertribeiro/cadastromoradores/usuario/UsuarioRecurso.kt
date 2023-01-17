package com.elbertribeiro.cadastromoradores.usuario

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/usuario")
class UsuarioRecurso(val usuarioServico: UsuarioServico) {

    @Operation(summary = "Listar todos usuarios")
    @ApiResponse(responseCode = "200", description = "Usuarios retornados com sucesso")
    @GetMapping
    fun listaUsuarios(): ResponseEntity<List<Usuario>>{
        return ResponseEntity.ok(usuarioServico.buscarListaUsuarios())
    }
}