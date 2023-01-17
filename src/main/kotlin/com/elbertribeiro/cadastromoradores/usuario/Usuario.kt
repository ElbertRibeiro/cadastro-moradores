package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.telefone.Telefone
import java.time.LocalDate
import javax.persistence.*

@Entity
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long = 0
    var nome: String = ""
    var email: String = ""
    var senha: String = ""
    val dataCriacao: LocalDate = LocalDate.now()
    var token: String = ""

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE])
    var telefones: List<Telefone>? = null
}