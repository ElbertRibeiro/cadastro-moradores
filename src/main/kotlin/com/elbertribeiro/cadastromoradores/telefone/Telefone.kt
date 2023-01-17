package com.elbertribeiro.cadastromoradores.telefone

import javax.persistence.*

@Entity
class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null

    @Column(nullable = false)
    val number: String = ""
}