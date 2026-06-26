package org.example.J1_fundamentos.Pratica.ContaBancaria.heranca;

public class BancoDemo {
    static void main() {
        ContaCorrente cc = new ContaCorrente("Jhon", 2000.0, 5.0);
        cc.exibirInformacoes();
        cc.sacar(100.0);
        cc.exibirInformacoes();

        System.out.println("===================");
        ContaPoupanca cp = new ContaPoupanca("Mary", 5000, 2.5);
        cp.exibirInformacoes();
        cp.aplicarRendimento();
        cp.exibirInformacoes();
    }
}
