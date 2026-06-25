package org.example.J1_fundamentos.TestesDePerformance.TP3.Exercicio007a009;

import java.time.LocalDateTime;

public class Conta {
    LocalDateTime dataAbertura = LocalDateTime.now();

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;

    public Conta(String titular, int numero, String agencia, double saldo) {
        getTitular(titular);
        getNumero(numero);
        getAgencia(agencia);
        getSaldo(saldo);
        setDataAbertura(LocalDateTime.now());
    }

    public void sacar(double valor) {
        if (saldo > 0 && saldo >= valor) {
            double sacar = getSaldo(saldo) - valor;
            System.out.println("Valor sacado: " + sacar);
        } else {
            System.out.println("Valor maior que o saldo atual");
        }
    }

    public void depositar(double valor) {
        double depositar = getSaldo(saldo) + valor;
        System.out.println("Valor do depósito: " + valor);
        System.out.println("Saldo: " + depositar);
    }

    public double calcularRendimento() {
        return getSaldo(saldo) * (10 / 100);
    }


    public String getTitular(String titular) {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero(int numero) {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia(String agencia) {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
