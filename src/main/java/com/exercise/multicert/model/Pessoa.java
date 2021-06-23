package com.exercise.multicert.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    @NotEmpty
    private String nome;

    @Column(length = 9, unique=true)
    @NotEmpty
    private long nif;

    @Column(length = 100)
    @NotEmpty
    private String morada;

    @Column(length = 15)
    @NotEmpty
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, long nif, String morada, String telefone) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
