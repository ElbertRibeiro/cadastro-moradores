package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.message.MessageResponseDto
import org.springframework.stereotype.Service

@Service
class UsuarioServico(val usuarioRepositorio: UsuarioRepositorio) {
    fun buscarListaUsuarios(): MutableList<Usuario> {
        return usuarioRepositorio.findAll()
    }

    fun salvarUsuario(usuario: Usuario): MessageResponseDto {
        return createMessageResponse(usuarioRepositorio.save(usuario).id, "Usuario criado com ID")
    }

    private fun createMessageResponse(id: Long, message: String): MessageResponseDto {
        val messageResponseDTO = MessageResponseDto()
        messageResponseDTO.message = "$message $id"
        return messageResponseDTO
    }
}