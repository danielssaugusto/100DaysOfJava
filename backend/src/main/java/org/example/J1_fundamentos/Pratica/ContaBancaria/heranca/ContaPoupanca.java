package org.example.J1_fundamentos.Pratica.ContaBancaria.heranca;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimentoAnual;

    public ContaPoupanca(String titular, double saldoInicial, double taxaRendimentoAnual) {
        super(titular, saldoInicial);
        this.taxaRendimentoAnual = taxaRendimentoAnual;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * (taxaRendimentoAnual / 100);
        super.depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na conta poupança.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de rendimento anual: R$" + taxaRendimentoAnual + "%");
    }
}


