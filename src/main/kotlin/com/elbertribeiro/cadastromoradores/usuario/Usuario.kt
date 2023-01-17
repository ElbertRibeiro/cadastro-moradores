package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.telefone.Telefone
import java.time.LocalDate
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