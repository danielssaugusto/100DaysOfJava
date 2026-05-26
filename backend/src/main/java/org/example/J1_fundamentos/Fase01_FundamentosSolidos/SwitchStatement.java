package org.example.J1_fundamentos.Fase01_FundamentosSolidos;

public class SwitchStatement {
    static void main() {
        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia errado.");
        }

        // A partir do Java 14 - Switch Expression
        switch (dia) {
            case 1, 7 -> System.out.println("Fim de Semana.");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> throw new IllegalArgumentException("Unexpected value: " + dia);
        }
    }
}
