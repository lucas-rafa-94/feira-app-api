package com.api.feiraapp.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProduto", updatable = false, nullable = false)
    private long id;
    private long idFeira;
    private long idFeirante;
    private String nome;
    private String descricao;
    private String categoria;
    private double precoKilo;
    private double precoUnidade;

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

    public long getIdFeirante() {
        return idFeirante;
    }

    public void setIdFeirante(long idFeirante) {
        this.idFeirante = idFeirante;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoKilo() {
        return precoKilo;
    }

    public void setPrecoKilo(double precoKilo) {
        this.precoKilo = precoKilo;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }
}
