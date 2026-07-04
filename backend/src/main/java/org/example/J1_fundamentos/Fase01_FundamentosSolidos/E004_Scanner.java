package org.example.J1_fundamentos.Fase01_FundamentosSolidos;

import java.util.Scanner;

public class E004_Scanner {
    static void main() {
        // 4. SCANNER (Entrada de Dados)
        // import java.util.Scanner; 1. A importação é obrigatória.

        Scanner leitor = new Scanner(System.in); // 2. Cria o objeto.
        System.out.println("Digite seu idade: ");
        int idade = leitor.nextInt(); // 3. Lê um número inteiro.

        System.out.println("Digite seu nome: ");
        leitor.nextLine(); // Limpeza de buffer ()
        String nome = leitor.nextLine(); // 4. Lê uma linha de texto.
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        leitor.close(); // 5. Fecha o scanner para liberar memória.
    }
}
