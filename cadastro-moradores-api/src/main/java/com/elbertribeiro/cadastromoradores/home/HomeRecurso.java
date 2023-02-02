package com.elbertribeiro.cadastromoradores.home;

import com.elbertribeiro.cadastromoradores.usuario.UsuarioRecurso;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/")
public class HomeRecurso {
    @Operation(summary = "Listar todas as collections")
    @GetMapping
    public ResponseEntity<HomeDto> getEntryPoint() {
        HomeDto rootEntryPoint = new HomeDto()
                .add(
                        linkTo(
                                methodOn(UsuarioRecurso.class)
                                        .listaUsuarios()
                        )
                                .withRel("lista-usuarios")
                );

        return ResponseEntity.ok(rootEntryPoint);
    }
}
