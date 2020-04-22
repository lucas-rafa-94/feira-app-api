package com.api.feiraapp.model;


import javax.persistence.*;

@Entity
@Table(name = "feirante")
public class FeiranteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idFeirante", updatable = false, nullable = false)
    private long id;
    private long idFeira;
    private String nome;
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdFeira() {
        return idFeira;
    }

    public void setIdFeira(long idFeira) {
        this.idFeira = idFeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
