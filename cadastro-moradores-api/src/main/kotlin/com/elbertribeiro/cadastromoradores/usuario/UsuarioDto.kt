package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.home.HomeDto
import com.elbertribeiro.cadastromoradores.telefone.TelefoneDto
import org.springframework.hateoas.RepresentationModel
import java.io.Serializable

/**
 * A DTO for the {@link com.elbertribeiro.cadastromoradores.usuario.Usuario} entity
 */
data class UsuarioDto(
    val nome: String = "",
    val email: String = "",
    val senha: String = "",
    val token: String = "",
    val telefones: MutableList<TelefoneDto>? = null
) : Serializable, RepresentationModel<HomeDto?>()