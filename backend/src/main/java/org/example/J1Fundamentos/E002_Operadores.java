package org.example.J1Fundamentos;

public class E002_Operadores {
    static void main() {
        int a = 5;
        int b = 2;

        // 2.1 Adição
        int sum = a + b;

        // 2.2 Subtração
        int sub = a - b;

        // 2.3 Multiplicação
        int mul = a * b;

        // 2.4 Divisão
        int div = a / b;

        // 2.5 Módulo - Resto da divisão
        int mod = a % b;

        // OBS.: Atenção com a Divisão Int: Se você dividir dois números inteiros, o Java corta as casas decimais. Exemplo: 5 / 2 resulta em 2, e não 2.5. Para obter 2.5, pelo menos um dos números precisa ser decimal: 5.0 / 2.

        // 2.6 Operadores de Atribuição e Atribuição Composta
        // Atribuição simples:
        int x = 10;

        // Atribuição com Operação:
        // +=, -=, *=, /= (x += 5; é o mesmo que x = x + 5;)
        x = x + 5;
        // OU
        x += 5;
        System.out.println(x);

        // 2.7 Operadores Relacionais (Comparação)
        // Usado para comparar valores. O resultado sempre é um boolean (true ou false)
        boolean a1 = a == b;
        boolean a2 = a != b;
        boolean a3 = a > b;
        boolean a4 = a < b;
        boolean a5 = a >= b;
        boolean a6 = a >= b;

        // 2.8 Operadores Lógicos
        // Usados para combinar múltiplas condições booleanas:
        // && (E / AND): Retorna true apenas se ambas as condições forem verdadeiras.
        if (a1 == a2 && a2 != a3) {}

        // || (OU / OR): Retorna true se pelo menos uma das condições for verdadeira.
        if (a1 == a2 || a2 == a3) {}

        // ! (NÃO / NOT): Inverte o valor lógico (!true vira false).
        if (!true) {}
    }
}
