package com.fabio.cadastrocliente.dtos;

import com.fabio.cadastrocliente.domain.enums.TipoCliente;

import java.io.Serializable;
import java.util.List;

public class ClienteNewDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private TipoCliente tipoCliente;
    private String cpfCnpj;
    private String email;
    private String senha;
    private EnderecoDto endereco;
    private List<TelefoneDto> telefones;

    public ClienteNewDto(Long id, String nome, TipoCliente tipoCliente, String cpfCnpj, String email, String senha,
                      EnderecoDto endereco, List<TelefoneDto> telefones) {
        this.id = id;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public ClienteNewDto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }

    public List<TelefoneDto> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDto> telefones) {
        this.telefones = telefones;
    }

}