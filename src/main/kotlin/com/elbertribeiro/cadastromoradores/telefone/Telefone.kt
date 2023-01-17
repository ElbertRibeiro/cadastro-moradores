package com.elbertribeiro.cadastromoradores.telefone

import javax.persistence.*

@Entity
class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long = 0

    @Column(nullable = false)
    var number: String? = null
}