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

    private String enderecoSegunda;
    private String horarioSegunda;

    private String enderecoTerca;
    private String horarioTerca;

    private String enderecoQuarta;
    private String horarioQuarta;

    private String enderecoQuinta;
    private String horarioQuinta;

    private String enderecoSexta;
    private String horarioSexta;

    private String enderecoSabado;
    private String horarioSabado;

    public CadastroModel() {
    }

    public String getEnderecoSegunda() {
        return enderecoSegunda;
    }

    public void setEnderecoSegunda(String enderecoSegunda) {
        this.enderecoSegunda = enderecoSegunda;
    }

    public String getHorarioSegunda() {
        return horarioSegunda;
    }

    public void setHorarioSegunda(String horarioSegunda) {
        this.horarioSegunda = horarioSegunda;
    }

    public String getEnderecoTerca() {
        return enderecoTerca;
    }

    public void setEnderecoTerca(String enderecoTerca) {
        this.enderecoTerca = enderecoTerca;
    }

    public String getHorarioTerca() {
        return horarioTerca;
    }

    public void setHorarioTerca(String horarioTerca) {
        this.horarioTerca = horarioTerca;
    }

    public String getEnderecoQuarta() {
        return enderecoQuarta;
    }

    public void setEnderecoQuarta(String enderecoQuarta) {
        this.enderecoQuarta = enderecoQuarta;
    }

    public String getHorarioQuarta() {
        return horarioQuarta;
    }

    public void setHorarioQuarta(String horarioQuarta) {
        this.horarioQuarta = horarioQuarta;
    }

    public String getEnderecoQuinta() {
        return enderecoQuinta;
    }

    public void setEnderecoQuinta(String enderecoQuinta) {
        this.enderecoQuinta = enderecoQuinta;
    }

    public String getHorarioQuinta() {
        return horarioQuinta;
    }

    public void setHorarioQuinta(String horarioQuinta) {
        this.horarioQuinta = horarioQuinta;
    }

    public String getEnderecoSexta() {
        return enderecoSexta;
    }

    public void setEnderecoSexta(String enderecoSexta) {
        this.enderecoSexta = enderecoSexta;
    }

    public String getHorarioSexta() {
        return horarioSexta;
    }

    public void setHorarioSexta(String horarioSexta) {
        this.horarioSexta = horarioSexta;
    }

    public String getEnderecoSabado() {
        return enderecoSabado;
    }

    public void setEnderecoSabado(String enderecoSabado) {
        this.enderecoSabado = enderecoSabado;
    }

    public String getHorarioSabado() {
        return horarioSabado;
    }

    public void setHorarioSabado(String horarioSabado) {
        this.horarioSabado = horarioSabado;
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

}
