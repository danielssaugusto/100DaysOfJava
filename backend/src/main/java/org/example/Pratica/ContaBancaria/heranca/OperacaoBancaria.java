package org.example.Pratica.ContaBancaria.heranca;

public class OperacaoBancaria {
    // Criação de constantes

    // public -> pode ser acessada de qualquer classe
    // static -> ela pertence à classe e não a uma instância específica.
    // final -> não pode ter seus valores modificados após serem atribuídos
    public static final int OP_DEPOSITO = 1;
    public static final int OP_SAQUE = 2;
    public static final int OP_TRANSFERENCIA = 3;

    private final int tipoOperacao;
    private double valor;

    // Construtor
    public OperacaoBancaria(int tipoOperacao, double valor) {
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    // Método
    public void processar() {
        switch (tipoOperacao) {
            case OP_DEPOSITO -> System.out.println("Processando depósito de R$" + valor);
            case OP_SAQUE -> System.out.println("Processando saque de R$" + valor);
            case OP_TRANSFERENCIA -> System.out.println("Processando transferência de R$" + valor);
            default -> System.out.println("Operação desconhecida.");
        }
    }

    public int getTipoOperacao() {
        return tipoOperacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
