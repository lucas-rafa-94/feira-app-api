package com.api.feiraapp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPedido", updatable = false, nullable = false)
    private long id;
    private long user;
    private String feira;
    private String endereco;

}
