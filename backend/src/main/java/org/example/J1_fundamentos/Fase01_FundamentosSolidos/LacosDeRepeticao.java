package org.example.J1_fundamentos.Fase01_FundamentosSolidos;

public class LacosDeRepeticao {
    static void main() {
        int count = 0;

        while (count < 10) {
            System.out.println("Count: " + count);
            count++;
        }

        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Count: " + counter);
        }
    }
}
