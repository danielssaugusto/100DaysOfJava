package org.example.J1_fundamentos.Pratica.arrays;

public class exemplos {
    static void main() {
        double[] temperatura = new double[30];

        // Todos os arrays já estão inicializados como 0.00
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
