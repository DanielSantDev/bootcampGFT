package com.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("****** Extrato Conta Corrente ****** \n");
        super.imprimirInfosComuns();

    }
}
