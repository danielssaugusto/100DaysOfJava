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
    public void sacar(double valor) {
        double valorDisponivel = getSaldo() + limiteExtra;
        double valorTotal = valor + getTaxaOperacao();
        double novoSaldo = valorDisponivel - valorTotal;

        if (valorTotal <= valorDisponivel && valorTotal > 0) {
            super.setSaldo(novoSaldo);
            System.out.println("Limite extra utilizado, caso necessário.");
        } else {
            System.out.println("Saldo + limite insuficiente!");
        }
    }
}
