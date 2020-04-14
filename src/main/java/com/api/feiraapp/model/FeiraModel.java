package com.api.feiraapp.model;

import javax.persistence.*;

@Entity
@Table(name = "feira")
public class FeiraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser", updatable = false, nullable = false)
    private long id;
    private String nome;
    private String endereco;

    public FeiraModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
