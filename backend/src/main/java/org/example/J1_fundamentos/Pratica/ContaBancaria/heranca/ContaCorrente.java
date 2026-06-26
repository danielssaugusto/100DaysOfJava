package org.example.J1_fundamentos.Pratica.ContaBancaria.heranca;

// Com o "extends" a ContaCorrente passa a herdar as características da ContaBancaria.
public class ContaCorrente extends ContaBancaria {
    private double taxaOperacao;

    public ContaCorrente(String titular, double saldoInicial, double taxaOperacao) {
        // Invoca o construtor da superclasse (ContaBancaria) passando os dois parâmetros obrigatórios
        super(titular, saldoInicial);
        this.taxaOperacao = taxaOperacao;
    };

    @Override
    protected void sacar(double valor) {
        double valorTotal = valor + taxaOperacao;

        if (valorTotal > 0 && valorTotal <= getSaldo()) {
            super.sacar(valor);
            super.sacar(taxaOperacao);
            System.out.println("Taxa de Operação de R$" + taxaOperacao + " foi aplicada.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para a conta corrente.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de Operação: R$" + taxaOperacao);
    }
}
