package org.example.J1_fundamentos.Pratica.ContaBancaria.heranca;

public class ContaCorrenteEspecial extends ContaCorrente {
    private double limiteExtra;

    public ContaCorrenteEspecial(String titular,
                                 double saldoInicial,
                                 double taxaOperacao,
                                 double limiteExtra) {
        super(titular, saldoInicial, taxaOperacao);
        this.limiteExtra = limiteExtra;
    }

    @Override
    public void sacar(double valor) { // Sacar: 100.0
        double valorDisponivel = getSaldo() + limiteExtra; // Saldo: 50.0 + Limite: 100.0 = 150.0
        double valorTotal = valor + getTaxaOperacao(); // Valor: 100.0 + Taxa de operação: 3.0 = 103.0
        double novoSaldo = valorDisponivel - valorTotal; // 150.0 - 103.0 = 47.0

        if (valorTotal <= valorDisponivel && valorTotal > 0) {
            ajustarSaldo(novoSaldo);
            System.out.println("Limite extra utilizado, caso necessário.");
        } else {
            System.out.println("Saldo + limite insuficiente!");
        }
    }
}
