package com.elbertribeiro.cadastromoradores.usuario;

import com.elbertribeiro.cadastromoradores.message.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioRecurso {
    final UsuarioServico usuarioServico;

    public UsuarioRecurso(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuarios() {
        return ResponseEntity.ok(usuarioServico.buscarListaUsuarios());
    }

    @PostMapping
    public ResponseEntity<MessageResponse> salvaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioServico.salvarUsuario(usuario));
    }
}
