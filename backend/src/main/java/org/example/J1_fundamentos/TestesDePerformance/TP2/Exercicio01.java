package org.example.J1_fundamentos.TestesDePerformance.TP2;

import java.util.Scanner;

/**
 * TP2 - Exercício 1: Cadastro de Usuário Completo
 * Objetivo: Solicitar dados, exibir de forma organizada e comparar a
 * quantidade de letras do nome do usuário com o nome da mãe e do pai.
 */
public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== CADASTRO DE USUÁRIO ==========");

        System.out.print("Digite o seu nome completo: ");
        String name = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Limpeza do buffer do teclado

        System.out.print("Digite o nome da sua mãe: ");
        String momName = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String dadName = scanner.nextLine();

        // .replace(" ", "").length() garante que contaremos apenas as LETRAS, ignorando os espaços.
        int nameLength = name.replace(" ", "").length();
        int momNameLength = momName.replace(" ", "").length();
        int dadNameLength = dadName.replace(" ", "").length();

        // --- EXIBIÇÃO ORGANIZADA DOS DADOS ---
        System.out.println("\n================ RESUMO ================");
        System.out.println("Nome do Usuário : " + name + " (" + age + " anos)");
        System.out.println("Nome da Mãe     : " + momName);
        System.out.println("Nome do Pai     : " + dadName);
        System.out.println("----------------------------------------");
        System.out.println("Letras no seu nome : " + nameLength);
        System.out.println("Letras no nome da mãe: " + momNameLength);
        System.out.println("Letras no nome do pai: " + dadNameLength);
        System.out.println("----------------------------------------");

        // --- LÓGICA DE COMPARAÇÃO CORRIGIDA ---
        // Verificação 1: Comparação com o nome da mãe
        if (nameLength > momNameLength) {
            System.out.println("-> Seu nome tem MAIS letras que o nome da sua mãe.");
        } else if (nameLength < momNameLength) {
            System.out.println("-> Seu nome tem MENOS letras que o nome da sua mãe.");
        } else {
            System.out.println("-> Seu nome tem a MESMA quantidade de letras que o nome da sua mãe.");
        }

        // Verificação 2: Comparação com o nome do pai
        if (nameLength > dadNameLength) {
            System.out.println("-> Seu nome tem MAIS letras que o nome do seu pai.");
        } else if (nameLength < dadNameLength) {
            System.out.println("-> Seu nome tem MENOS letras que o nome do seu pai.");
        } else {
            System.out.println("-> Seu nome tem a MESMA quantidade de letras que o nome do seu pai.");
        }

        System.out.println("========================================");

        scanner.close();
    }
}