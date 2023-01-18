package com.elbertribeiro.cadastromoradores.telefone

class TelefoneConverter {
    fun Telefone.toTelefoneDto() = TelefoneDto(
        numero = numero
    )
}