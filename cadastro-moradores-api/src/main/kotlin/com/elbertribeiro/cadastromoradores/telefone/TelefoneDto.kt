package com.elbertribeiro.cadastromoradores.telefone

import java.io.Serializable

/**
 * A DTO for the {@link com.elbertribeiro.cadastromoradores.telefone.Telefone} entity
 */
data class TelefoneDto(val id: Long = 0, val numero: String = "") : Serializable