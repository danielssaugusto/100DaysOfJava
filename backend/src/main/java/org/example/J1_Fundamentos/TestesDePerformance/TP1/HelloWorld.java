package org.example.J1_Fundamentos.TestesDePerformance.TP1;

import java.util.Scanner;

/**
 * TESTE DE PERFORMANCE 1 (TP1)
 * * Exercício 01: Instalar o JDK (java -version)
 * Exercício 02: Instalar e Configurar a IDE IntelliJ IDEA
 * Exercício 05: Build do Projeto (Ctrl + F9)
 * Exercício 06: Rodar a Aplicação (Run 'HelloWorld.main()')
 * Exercício 10: Depurar Código (Uso de Breakpoints, Step Over/Into)
 */

// Exercício 03: Criar a classe HelloWorld com o método main
class HelloWorld {

    public static void main(String[] args) {
        // Exercício 09: Inicializando o Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Exercício 04: Programa simples inicial
        System.out.println("Hello, World!");
        System.out.println("-----------------------------------");

        // Exercício 07 & 09: Solicitando e lendo dados do usuário
        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpeza de buffer do teclado

        // Exercício 08: Declaração de variáveis com diferentes tipos de dados
        String data = "23/06/2026";
        double peso = 76.5;

        // Exibição dos resultados formatados
        System.out.println("\n--- Informações Registradas ---");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Data: " + data);
        System.out.println("Peso: " + peso + " kg");

        // Fechamento do scanner (boa prática)
        scanner.close();
    }
}