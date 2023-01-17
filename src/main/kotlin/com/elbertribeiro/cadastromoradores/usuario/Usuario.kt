package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.telefone.Telefone
import java.time.LocalDate
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.validation.constraints.Email

@Entity
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null
    val nome: String = ""

    @Email
    val email: String = ""
    val senha: String = ""
    val dataCriacao: LocalDate = LocalDate.now()
    val token: String = ""

    @OneToMany(cascade = [CascadeType.PERSIST])
    val telefones: List<Telefone>? = null
}