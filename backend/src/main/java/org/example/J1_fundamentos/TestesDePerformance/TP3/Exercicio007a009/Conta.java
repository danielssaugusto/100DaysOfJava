package org.example.J1_fundamentos.TestesDePerformance.TP3.Exercicio007a009;

import java.time.LocalDateTime;

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private LocalDateTime dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo) {
        setTitular(titular);
        setNumero(numero);
        setAgencia(agencia);
        this.saldo = saldo;
        this.dataAbertura = LocalDateTime.now();
    }

    public void sacar(double valor) {
        if (saldo > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado.");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor do depósito: " + valor);
        System.out.println("Saldo: " + saldo);
    }

    public void calcularRendimento() {
        double rendimento = saldo * ((double) 10 / 100);
        saldo += rendimento;
        System.out.println("Rendimento: " + rendimento + " | Saldo: " + saldo);
    }

    public void displayInformationConta() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("Data de abertura: " + getDataAbertura());
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
