package com.elbertribeiro.cadastromoradores.usuario

fun Usuario.toUsuarioDto() = UsuarioDto(
    nome, email, senha, token
)