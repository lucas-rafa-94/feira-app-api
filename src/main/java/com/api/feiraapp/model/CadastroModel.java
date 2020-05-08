package com.api.feiraapp.model;

import javax.persistence.*;

@Entity
@Table(name = "cadastro")
public class CadastroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCadastro", updatable = false, nullable = false)
    private long id;
    private String nomeCompleto;
    private String endereco;
    private String dataNascimento;
    private String celular;
    private String produtos;
    private String produtorOuRevendedor;
    private String barracas;
    private String dias;

    public CadastroModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getProdutorOuRevendedor() {
        return produtorOuRevendedor;
    }

    public void setProdutorOuRevendedor(String produtorOuRevendedor) {
        this.produtorOuRevendedor = produtorOuRevendedor;
    }

    public String getBarracas() {
        return barracas;
    }

    public void setBarracas(String barracas) {
        this.barracas = barracas;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}
