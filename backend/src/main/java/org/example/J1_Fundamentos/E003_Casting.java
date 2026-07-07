package org.example.J1_Fundamentos;

public class E003_Casting {
    static void main() {
        // Casting é o nome dado à conversão de um tipo de dado em outro. Imagine que você tem um número que está guardado como double, mas precisa passar esse valor para uma função que só aceita int. Você precisa fazer um "cast".

        // 3.1 Casting Implícito (Widening Casting)
        // Acontece de forma automática pelo próprio Java. Isso ocorre quando estamos convertendo um tipo menor para um tipo maior (que ocupa mais espaço na memória), impossibilitando a perda de dados.

        // Ordem: byte ➡️ short ➡️ char ➡️ int ➡️ long ➡️ float ➡️ double

        // Exemplo:
        int numeroInteiro = 9;
        double numeroDecimal = numeroInteiro; // O Java faz automaticamente.
        System.out.println(numeroDecimal); // Vai imprimir 9.0

        // 3.2 Casting Explícito (Narrowing Casting)
        // Acontece manualmente quando tentamos colocar um tipo maior dentro de um tipo menor. Como há risco de perda de informação (casas decimais ou estouro de tamanho), o Java te obriga a confirmar que você sabe o que está fazendo, colocando o tipo desejado entre parênteses ().

        // Exemplo:
        double meuDouble = 9.78;
        int meuInteiro = (int) meuDouble;
        System.out.println(meuInteiro); // Vai imprimir 9 (as casas decimais se perdem.)

        // OBS.: "Estouro" de memória (OVERFLOW)
        // Se você tentar forçar um número muito grande dentro de um tipo que não o suporta, o Java não vai dar erro de compilação, mas o número vai "dar a volta" e virar um valor bizarro:

        // Exemplo:
        int numeroGrande = 130;
        byte meuByte = (byte) numeroGrande; // O limite do byte é 127.
        System.out.println(meuByte); // Vai imprimir -126 (estourou o limite).
    }
}
