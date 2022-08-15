import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente duFolli = new Cliente();
        duFolli.setNome("Du Folli");
        Conta cc = new ContaCorrente(duFolli);
        Conta poupanca = new ContaPoupanca(duFolli);

        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
