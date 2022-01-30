package com.banco;

import java.util.List;

public class Banco {

    private List<Conta> contas;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
