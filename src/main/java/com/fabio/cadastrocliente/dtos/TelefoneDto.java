package com.fabio.cadastrocliente.dtos;

import java.io.Serializable;

public class TelefoneDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String numero;

    public TelefoneDto(Long id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public TelefoneDto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
