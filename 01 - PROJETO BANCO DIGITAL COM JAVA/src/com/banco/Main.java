package com.banco;

public class Main {

    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");

        Conta cc = new ContaCorrente(daniel);
        Conta poupanca = new ContaPoupanca(daniel);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(30);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
