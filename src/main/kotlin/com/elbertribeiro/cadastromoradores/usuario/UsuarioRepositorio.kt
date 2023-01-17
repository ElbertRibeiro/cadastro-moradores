package com.elbertribeiro.cadastromoradores.usuario

import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepositorio: JpaRepository<Usuario, Long> {
}