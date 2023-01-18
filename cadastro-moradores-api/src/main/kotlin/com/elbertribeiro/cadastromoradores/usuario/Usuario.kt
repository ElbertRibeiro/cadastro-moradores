package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.telefone.Telefone
import com.elbertribeiro.cadastromoradores.telefone.toTelefoneDto
import java.time.LocalDate
import java.util.stream.Collectors
import javax.persistence.*

@Entity
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long = 0
    val nome: String = ""
    val email: String = ""
    val senha: String = ""
    val dataCriacao: LocalDate = LocalDate.now()
    val token: String = ""

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE])
    val telefones: List<Telefone>? = null
}

fun Usuario.toUsuarioDto() = UsuarioDto(
    nome, email, senha, token, telefones = telefones?.stream()?.map { telefone -> telefone.toTelefoneDto() }?.collect(
        Collectors.toList())
)