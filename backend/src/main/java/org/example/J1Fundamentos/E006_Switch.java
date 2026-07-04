package org.example.J1Fundamentos;

public class E006_Switch {
    static void main() {
        // O switch avalia uma única variável e compara seu valor com vários "casos" (case). É uma alternativa mais limpa ao if/else quando você tem muitas opções fixas para uma mesma variável.

        int diaDaSemana = 20;

        switch (diaDaSemana) {
            case 19:
                System.out.println("Domingo");
                break;
            case 20:
                System.out.println("Segunda-feira");
                break;
            case 21:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
    }
}
