package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.message.MessageResponseDto
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.stream.Collectors

@RestController
@RequestMapping("/api/v1/usuario")
class UsuarioRecurso(val usuarioServicoImp: UsuarioServicoImp) {

    @Operation(summary = "Listar todos usuarios")
    @ApiResponse(responseCode = "200", description = "Usuarios retornados com sucesso")
    @GetMapping
    fun listaUsuarios(): ResponseEntity<List<UsuarioDto>> {
        return ResponseEntity.ok(usuarioServicoImp.buscarListaUsuarios().stream().map { usuario -> usuario.toUsuarioDto() }
            .collect(Collectors.toList()))
    }

    @Operation(summary = "Salvar usuario")
    @ApiResponse(responseCode = "201", description = "Retorna ID do usuario criado")
    @PostMapping
    fun salvaUsuario(@RequestBody usuario: Usuario): ResponseEntity<MessageResponseDto> {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioServicoImp.salvarUsuario(usuario))
    }
}