package com.elbertribeiro.cadastromoradores.usuario

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepositorio: JpaRepository<Usuario, Long>