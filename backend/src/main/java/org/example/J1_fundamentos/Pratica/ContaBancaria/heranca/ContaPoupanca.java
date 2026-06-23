package org.example.J1_fundamentos.Pratica.ContaBancaria.heranca;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimentoAnual;

    public ContaPoupanca(String titular, double saldoInicial, double taxaRendimentoAnual) {
        super(titular, saldoInicial);
    }
}
