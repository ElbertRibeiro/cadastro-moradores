package com.elbertribeiro.cadastromoradores.usuario

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UsuarioServicoTest {

    @Test
    fun buscarListaUsuarios() {
        val mockedList: MutableList<Usuario> = mutableListOf()

        val repositorio = mockk<UsuarioRepositorio>()
        every { repositorio.findAll() } returns mockedList

        val servico = UsuarioServico(repositorio)

        val result = servico.buscarListaUsuarios()
        verify { servico.buscarListaUsuarios() }

        assertEquals(mockedList, result)
    }
}