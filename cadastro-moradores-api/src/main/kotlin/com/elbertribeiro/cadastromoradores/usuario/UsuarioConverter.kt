package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.telefone.toTelefoneDto
import java.util.stream.Collectors

fun Usuario.toUsuarioDto() = UsuarioDto(
    nome, email, senha, token, telefones = telefones?.stream()?.map { telefone -> telefone.toTelefoneDto() }?.collect(
        Collectors.toList())
)