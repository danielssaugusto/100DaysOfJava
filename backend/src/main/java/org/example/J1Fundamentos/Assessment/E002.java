package org.example.J1Fundamentos.Assessment;

public class E002 {
    String name;
    String password;


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
    }
}


/*
* Solicite ao usuário seu nome e uma senha.
A senha deve:
Ter no mínimo 8 caracteres.
Conter pelo menos uma letra maiúscula, um número e um caractere especial (@, #, $, etc.).
Caso a senha seja inválida, o programa deve informar o erro específico e solicitar uma nova tentativa.
* */