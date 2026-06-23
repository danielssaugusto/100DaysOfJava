package org.example.J1_fundamentos.TestesDePerformance.TP1;

/* Teste de Performance 1
* Exercício 01: Instalar o JDK
* Link: https://www.oracle.com/java/technologies/downloads/
* Verificar a instalação no terminal: java -version
*
* Exercício 02: Instalar e Configurar a IDE IntelliJ IDEA
* Link: https://www.jetbrains.com/idea/
 */

import java.util.Scanner;

// Exercício 03: criar uma classe chamada "HelloWorld.java" com um método main
class HelloWorld {
    public static void main(String[] args) {
        // Exercício 09: Ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Execício 07: Modificar para exibir diferentes mensagens
        // Exercício 08: usar variáveis e diferentes tipos de dados
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        String data = "23/06/2026";
        double peso = 76.5;

        // Exercício 04: criando um programa simples
        System.out.println("Hello, World!");

        System.out.println("Name: " + name + " Idade: " + idade + " Data: " + data + " Peso: " + peso);
    }

    // Exercício 05:
    // Agora deve ser criado o build selecionando "Build Project" ou pressionando "Ctrl + F9" para compilar o projeto.
    // Exercício 06:
    // Após isso selecione "Run 'HelloWorld.main()'"
}
