package models;

import models.Cliente;
import models.Conta;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato models.Conta Corrente ===");
        super.imprimirDadosConta();
    }


}


