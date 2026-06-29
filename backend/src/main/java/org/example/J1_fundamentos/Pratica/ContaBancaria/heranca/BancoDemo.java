package org.example.J1_fundamentos.Pratica.ContaBancaria.heranca;

public class BancoDemo {
    static void main() {
        // DemoBancario1();
        // DemoBancario2();
        OperacaoBancaria op = new OperacaoBancaria(OperacaoBancaria.OP_SAQUE, 500.0);
    }

    private static void DemoBancario2() {
        ContaCorrente cc = new ContaCorrente("Jhon", 2000.0, 5.0);
        ContaPoupanca cp = new ContaPoupanca("Mary", 5000, 2.5);

        ContaBancaria ref;

        ref = cc;
        ref.exibirInformacoes();
        System.out.println();

        ref = cp;
        ref.exibirInformacoes();
    }

    private static void DemoBancario1() {
        ContaCorrente cc = new ContaCorrente("Jhon", 2000.0, 5.0);
        cc.exibirInformacoes();
        cc.sacar(100.0);
        cc.exibirInformacoes();

        System.out.println("===================");
        ContaPoupanca cp = new ContaPoupanca("Mary", 5000, 2.5);
        cp.exibirInformacoes();
        cp.aplicarRendimento();
        cp.exibirInformacoes();
        cp.sacar(100.0);
        cp.exibirInformacoes();

        System.out.println("===================");
        ContaPoupanca cp2 = new ContaPoupanca("Mary", 1000.0, 2.0);
        cp2.exibirInformacoes();
    }
}
