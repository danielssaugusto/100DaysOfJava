package org.example.J1Fundamentos.Assessment;

import java.util.Scanner;

public class E002 {
    static void main() {
        String name;
        String password;

        Scanner sc = new Scanner(System.in);
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