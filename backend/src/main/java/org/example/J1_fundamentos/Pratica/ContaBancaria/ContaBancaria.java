package org.example.J1_fundamentos.Pratica.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSacado) {
        this.saldo += valorSacado;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void exibirInformacoes() {

    }
}
