package org.example.J3_Advance.Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class J002_TryCatch {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Início do programa.");
        int result = 10 / 2;
        System.out.println("Meio do programa - resultado: " + result);

        try {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            System.out.println("Você digitou o número: " + num);
        } catch (InputMismatchException ex) {
            System.out.println("Error: invalid number.");
        } catch (NoSuchElementException ex) {
            System.out.println("Não há elemento para mostrar.");
        } catch (Exception ex) {
            System.out.println("Erro genérico.");
        } finally {
            System.out.println("Conexão encerrada.");
        }

    }
}
