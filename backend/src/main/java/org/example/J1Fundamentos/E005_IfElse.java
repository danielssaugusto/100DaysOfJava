package org.example.J1Fundamentos;

public class E005_IfElse {
    static void main() {
        int nota = 7;

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Recuperação.");
        }

        // OPERADOR TERNÁRIO
        // Sintaxe do operador:
        // (Condição) ? se verdadeiro : se falso;

        // Exemplo:
        int idade = 18;
        String status = (idade >= 18) ? "Ok" : "Não";
        System.out.println(status);
    }
}
