package org.example.J1_Fundamentos;

public class E007_Loops {
    static void main() {
        // 7. LOOPS (ESTRUTURAS DE REPETIÇÃO)

        // WHILE
        // Executa o bloco enquanto a condição for verdadeira. O teste é feito antes de entrar no loop. Se a condição começar como falsa, ele nunca roda.
        int contador = 1;

        while (contador <= 3) {
            System.out.println("Contagem" + contador);
            contador++; // Incremento crucial para o loop não ser infinito.
        }

        // DO-WHILE
        // A diferença crucial é que o teste da condição é feito no final. Isso garante que o código seja executado pelo menos uma vez, mesmo que a condição seja falsa desde o início.

        int opcao = 0;
        do {
            System.out.println("Menu executado pelo menos uma vez.");
        } while (opcao != 0); // Condição falsa, mas rodou uma vez.

        // FOR
        // É o loop ideal quando você já sabe exatamente quantas vezes quer repetir o código. Ele agrupa a inicialização, a condição e o incremento em uma única linha.

        // (Inicialização; condição; incremento)
        for (int i = 0; i < 5; i++) {
            System.out.println("Rodada do for: " + i);
        }
    }
}
