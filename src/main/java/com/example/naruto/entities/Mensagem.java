package com.example.naruto.entities;

import org.springframework.stereotype.Component;

@Component
public class Mensagem {

    private String texto;

    public Mensagem() {
    }

    public Mensagem(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public Mensagem setTexto(String texto) {
        this.texto = texto;
        return this;
    }
}
