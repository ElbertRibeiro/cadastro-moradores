package com.elbertribeiro.cadastromoradores.usuario;

import com.elbertribeiro.cadastromoradores.telefone.TelefoneDto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link Usuario} entity
 */
public class UsuarioDto implements Serializable {
    private final String nome;
    private final String email;
    private final String senha;
    private final LocalDate dataCriacao;
    private final String token;
    private final List<TelefoneDto> telefones;

    public UsuarioDto(String nome, String email, String senha, LocalDate dataCriacao, String token, List<TelefoneDto> telefones) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
        this.token = token;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getToken() {
        return token;
    }

    public List<TelefoneDto> getTelefones() {
        return telefones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDto entity = (UsuarioDto) o;
        return Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.senha, entity.senha) &&
                Objects.equals(this.dataCriacao, entity.dataCriacao) &&
                Objects.equals(this.token, entity.token) &&
                Objects.equals(this.telefones, entity.telefones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, senha, dataCriacao, token, telefones);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ", " +
                "email = " + email + ", " +
                "senha = " + senha + ", " +
                "dataCriacao = " + dataCriacao + ", " +
                "token = " + token + ", " +
                "telefones = " + telefones + ")";
    }
}