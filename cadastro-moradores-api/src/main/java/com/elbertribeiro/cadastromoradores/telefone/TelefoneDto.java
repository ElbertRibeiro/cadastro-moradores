package com.elbertribeiro.cadastromoradores.telefone;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Telefone} entity
 */
public class TelefoneDto implements Serializable {
    private final String numero;

    public TelefoneDto(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefoneDto entity = (TelefoneDto) o;
        return Objects.equals(this.numero, entity.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "numero = " + numero + ")";
    }
}