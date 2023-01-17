package com.elbertribeiro.cadastromoradores.telefone

import javax.persistence.*

@Entity
class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long = 0

    @Column(nullable = false)
    val numero: String? = null
}