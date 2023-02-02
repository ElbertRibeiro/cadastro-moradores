package com.elbertribeiro.cadastromoradores.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UsuarioServicoTest {

    @Mock
    List<Usuario> usuarios;
    Usuario usuario = mock(Usuario.class);
    UsuarioRepositorio repositorio = mock(UsuarioRepositorio.class);

    @Test
    void buscarListaUsuariosTest() {
        when(repositorio.findAll()).thenReturn(usuarios);
        UsuarioServico usuarioServico = new UsuarioServico(repositorio);
        Assertions.assertEquals(usuarios, usuarioServico.buscarListaUsuarios());
    }

    @Test
    void salvarUsuarioTest() {
        when(repositorio.save(usuario)).thenReturn(usuario);
        UsuarioServico usuarioServico = new UsuarioServico(repositorio);
        Assertions.assertNotNull(usuarioServico.salvarUsuario(usuario));
    }
}
