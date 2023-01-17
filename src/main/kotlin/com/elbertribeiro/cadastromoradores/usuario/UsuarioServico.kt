package com.elbertribeiro.cadastromoradores.usuario

import org.springframework.stereotype.Service

@Service
class UsuarioServico(val usuarioRepositorio: UsuarioRepositorio) {
    fun buscarListaUsuarios(): List<Usuario>{
        return usuarioRepositorio.findAll()
    }

    fun salvarUsuario(usuario: Usuario): Long {
        return usuarioRepositorio.save(usuario).id
    }
}