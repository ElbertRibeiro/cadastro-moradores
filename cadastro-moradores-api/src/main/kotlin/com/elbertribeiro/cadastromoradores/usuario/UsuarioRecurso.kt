package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.message.MessageResponseDTO
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/usuario")
class UsuarioRecurso(val usuarioServico: UsuarioServico) {

    @Operation(summary = "Listar todos usuarios")
    @ApiResponse(responseCode = "200", description = "Usuarios retornados com sucesso")
    @GetMapping
    fun listaUsuarios(): ResponseEntity<List<Usuario>>{
        return ResponseEntity.ok(usuarioServico.buscarListaUsuarios())
    }

    @Operation(summary = "Salvar usuario")
    @ApiResponse(responseCode = "201", description = "Retorna ID do usuario criado")
    @PostMapping
    fun salvaUsuario(@RequestBody usuario: Usuario): ResponseEntity<MessageResponseDTO> {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioServico.salvarUsuario(usuario))
    }
}