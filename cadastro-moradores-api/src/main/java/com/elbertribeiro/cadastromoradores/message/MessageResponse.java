package com.elbertribeiro.cadastromoradores.message;

public class MessageResponse {
    private String mensagem;

    public MessageResponse(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
