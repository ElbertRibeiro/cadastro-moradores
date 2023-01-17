package com.elbertribeiro.cadastromoradores.usuario

import com.elbertribeiro.cadastromoradores.telefone.Telefone
import org.hibernate.validator.constraints.Email
import org.hibernate.validator.constraints.NotEmpty
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private val idUsuario: Long = 0

    @NotNull
    @NotEmpty
    private val nome: String = ""

    @Email
    @NotNull
    @Column(unique = true)
    @NotEmpty
    @Size(min = 5, max = 30)
    private val email: String = ""

    @NotNull
    @NotEmpty
    private val senha: String = ""
    private val dataCriacao: LocalDate = LocalDate.now()
    private val dataAtualizacao: LocalDate = LocalDate.now()
    private val ultimoLogin: LocalDateTime? = null

    @Size(max = 1024)
    private val token: String = ""

    @OneToMany(cascade = [CascadeType.ALL])
    private val telefones: List<Telefone>? = null
}