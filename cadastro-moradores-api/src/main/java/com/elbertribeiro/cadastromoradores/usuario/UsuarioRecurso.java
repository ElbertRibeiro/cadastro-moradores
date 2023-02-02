package com.elbertribeiro.cadastromoradores.usuario;

import com.elbertribeiro.cadastromoradores.message.MessageResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioRecurso {
    final UsuarioServico usuarioServico;

    public UsuarioRecurso(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
    }

    @Operation(summary = "Listar todos usuarios")
    @ApiResponse(responseCode = "200", description = "Usuarios retornados com sucesso")
    @GetMapping
    public ResponseEntity<List<UsuarioDto>> listaUsuarios() {
        return ResponseEntity.ok(usuarioServico.buscarListaUsuarios()
                .stream()
                .map(usuario -> new ModelMapper().map(usuario, UsuarioDto.class))
                .collect(Collectors.toList()));
    }

    @Operation(summary = "Salvar usuario")
    @ApiResponse(responseCode = "201", description = "Retorna ID do usuario criado")
    @PostMapping
    public ResponseEntity<MessageResponse> salvaUsuario(@RequestBody UsuarioDto usuarioDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuarioServico.salvarUsuario(new ModelMapper().map(usuarioDto, Usuario.class)));
    }
}
