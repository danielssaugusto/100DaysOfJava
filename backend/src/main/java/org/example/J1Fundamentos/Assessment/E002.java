package org.example.J1Fundamentos.Assessment;

import java.util.Scanner;

public class E002 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String name;
        String password;

        do {
            System.out.println("Enter a password: ");
            password = sc.nextLine();

        } while (!passwordValidator(password));

        System.out.println("Valid password!");
    }

    public static boolean passwordValidator(String password) {
        if (password.length() < 8) {
            System.out.println("Weak password! Your password cannot be less than 8 characters long.");
            return false;
        }

        boolean isUpper = false;
        boolean isNumber = false;
        boolean isSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                isUpper = true;
            }

            if (Character.isDigit(c)) {
                isNumber = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                isSpecial = true;
            }
        }

        if (!isUpper) {
            System.out.println("The password needs a one upper char.");
            return false;
        }

        if (!isNumber) {
            System.out.println("The password needs a one number.");
            return false;
        }

        if (!isSpecial) {
            System.out.println("The password needs a one special char.");
            return false;
        }

        return true;
    }
}

/*
    String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

    if (senha.matches(regex)) {
            System.out.println("Senha válida!");
    } else {
            System.out.println("Senha inválida.");
    }

    O que significa?
    ^                   início da String
    (?=.*[A-Z])         pelo menos uma letra maiúscula
    (?=.*\d)            pelo menos um número
    (?=.*[@#$%^&+=!])   pelo menos um caractere especial
    .{8,}               mínimo de 8 caracteres
    $                   fim da String

 */