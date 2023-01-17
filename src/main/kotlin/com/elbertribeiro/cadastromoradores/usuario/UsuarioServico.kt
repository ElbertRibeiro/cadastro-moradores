package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.message.MessageResponseDTO
import org.springframework.stereotype.Service

@Service
class UsuarioServico(val usuarioRepositorio: UsuarioRepositorio) {
    fun buscarListaUsuarios(): List<Usuario> {
        return usuarioRepositorio.findAll()
    }

    fun salvarUsuario(usuario: Usuario): MessageResponseDTO {
        return createMessageResponse(usuarioRepositorio.save(usuario).id, "Usuario criado com ID")
    }

    private fun createMessageResponse(id: Long, message: String): MessageResponseDTO {
        val messageResponseDTO = MessageResponseDTO()
        messageResponseDTO.message = "$message $id"
        return messageResponseDTO
    }
}