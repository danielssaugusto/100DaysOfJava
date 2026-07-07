package org.example.J1_Fundamentos;

public class E001_TiposPrimitivos {

    public static void main(String[] args) {

        /*
         * TIPOS PRIMITIVOS
         *
         * byte    → 8 bits (1 byte). Guarda valores de −128$ a 127.
         * short   → 16 bits (2 bytes). Guarda valores de −32.768 a 32.767.
         * int     → 32 bits (4 bytes). Guarda valores de aproximadamente −2 bilhões a 2 bilhões.
         * long    → 64 bits (8 bytes). Na declaração, costuma-se usar a letra L (ex: long populacao = 8000000000L;).
         * float   → 32 bits (4 bytes).
         *           Precisão de 6 a 7 casas decimais. Exige a letra f ou F no final do valor (ex: float nota = 8.5f;).
         * double  → 64 bits (8 bytes).
         *           Tem precisão de cerca de 15 casas decimais. É o padrão do Java para números com ponto flutuante.
         * char    → caractere Unicode
         * boolean → true ou false
         */

        int idade = 25;
        double salario = 15500.50;
        char sexo = 'M';
        boolean ativo = true;

        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(ativo);
    }
}