package models;

import models.Cliente;
import models.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato models.Conta Poupanca ===");
        super.imprimirDadosConta();
    }

}
