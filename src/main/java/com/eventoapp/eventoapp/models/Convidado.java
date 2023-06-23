package com.eventoapp.eventoapp.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Convidado {


    @NotEmpty
    private String nome;

    @Id
    @NotEmpty
    private String cpf;

    @ManyToOne
    private Evento evento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
