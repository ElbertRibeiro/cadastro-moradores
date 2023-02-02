package com.elbertribeiro.cadastromoradores.usuario;

import com.elbertribeiro.cadastromoradores.message.MessageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServico {
    final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServico(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public List<Usuario> buscarListaUsuarios(){
        return usuarioRepositorio.findAll();
    }

    public MessageResponse salvarUsuario(Usuario usuario) {
        return new MessageResponse( "Usuario criado com ID " + usuarioRepositorio.save(usuario).getId());
    }
}
