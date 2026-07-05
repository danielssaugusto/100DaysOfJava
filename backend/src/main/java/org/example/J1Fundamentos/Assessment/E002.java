package org.example.J1Fundamentos.Assessment;

public class E002 {
    static void main() {
        String name;
        String password;

    }

    public static boolean passwordValidator(String password) {
        if (password.length() < 8) {
            System.out.println("Senha fraca! Sua senha não pode ter menos de oito caracteres.");
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