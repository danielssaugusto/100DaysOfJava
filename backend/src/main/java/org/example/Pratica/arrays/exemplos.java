package org.example.Pratica.arrays;

public class exemplos {
    static void main() {
        // exemploTemperatura();
        // exemploSaldo();
    }

    private static void exemploSaldo() {
        double[] saldos = {1000.0, 2500.05, 320.75, 10000.45, 500.00};

        for (double saldo : saldos) {
            if (saldo > 1000) {
                System.out.println("Saldo acima de mil: R$" + saldo);
            }
        }
    }

    private static void exemploTemperatura() {
        double[] temperatura = new double[30];

        // Todos os arrays já estão inicializados como 0,00
        temperatura[0] = 23.4;
        temperatura[1] = 33.5;
        temperatura[2] = 26.2;
        temperatura[3] = 12.2;

        double soma = 0;
        for (int i = 0; i < temperatura.length; i++) {
            soma += temperatura[i];
        }

        double media = soma / temperatura.length;
        System.out.println("Média das temperaturas: " + media);
    }
}
