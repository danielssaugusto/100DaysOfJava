package org.example.J1Fundamentos;

import java.util.Scanner;

public class E001_SintaxeBasica {
    public static void main(String[] args) {

        /* SUMÁRIO:
        * 1. Variáveis e tipos primitivos
        * 2. Operadores
        * 3. Casting
        * 4. Scanner
        * 5. Condicionais
        * 6. Switch
        * 7. Loops
        * 8. Arrays
        */

        // 1. VARIÁVEIS E TIPOS PRIMITIVOS
        // Em java há 8 tipos primitivos de dados.

        // 1.1 TIPOS INTEIROS
        byte tipoByte;
        // Ocupa 8 bits (1 byte). Guarda valores de -128$ a 127.

        short tipoShort;
        // Ocupa 16 bits (2 bytes). Guarda valores de -32.768 a 32.767.

        int tipoInt;
        //  Ocupa 32 bits (4 bytes). É o tipo mais comum para inteiros. Guarda valores de aproximadamente -2 bilhões a 2 bilhões.

        long tipoLong;
        // Ocupa 64 bits (8 bytes). Usado para números gigantescos. Na declaração, costuma-se usar a letra L no final do número (ex: long populacao = 8000000000L;).

        // 1.2. TIPO DE PONTO FLUTUANTE (DECIMAIS)
        float tipoFloat;
        // Ocupa 32 bits (4 bytes). Tem precisão de cerca de 6 a 7 casas decimais. Exige a letra f ou F no final do valor (ex: float nota = 8.5f;).

        double tipoDouble;
        // Ocupa 64 bits (8 bytes). Tem precisão de cerca de 15 casas decimais. É o padrão do Java para números com ponto flutuante.

        // OBS.: Não recomenda-se usar o tipo "float", no lugar usamos o double.

        // 1.3. TIPO DE CARACTERE
        char tipoChar;
        // Ocupa 16 bits (2 bytes). Armazena um único caractere Unicode (como letras, números ou símbolos). O valor deve ser envolvido por aspas simples (ex: char letra = 'A';).

        // 1.4. TIPO BOOLEANO (LÓGICO)
        boolean tipoBooleano;
        // Ocupa apenas 1 bit de informação (embora seu tamanho exato na memória dependa da máquina virtual). Só pode assumir dois valores: true (verdadeiro) ou false (falso).

        // 2. OPERADORES
        // Declarando duas variáveis e seus valores (Para exemplificar):
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

        // 3. CASTING
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

        // 4. SCANNER (Entrada de Dados)
        // import java.util.Scanner; 1. A importação é obrigatória.

        Scanner leitor = new Scanner(System.in); // 2. Cria o objeto.
        System.out.println("Digite seu idade: ");
        int idade = leitor.nextInt(); // 3. Lê um número inteiro.

        System.out.println("Digite seu nome: ");
        leitor.nextLine(); // Limpeza de buffer ()
        String nome = leitor.nextLine(); // 4. Lê uma linha de texto.
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        leitor.close(); // 5. Fecha o scanner para liberar memória.

        // 5. CONDICIONAIS: IF / ELSE
        int nota = 7;

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Recuperação.");
        }

        // 6. SWITCH
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

        // 7. LOOPS (ESTRUTURAS DE REPETIÇÃO)

        // WHILE
        // Executa o bloco enquanto a condição for verdadeira. O teste é feito antes de entrar no loop. Se a condição começar como falsa, ele nunca roda.
        int contador = 1;

        while (contador <= 3) {
            System.out.println("Contagem" + contador);
            contador++; // Incremento crucial para o loop não ser infinito.
        }

        // DO-WHILE
        // A diferença crucial é que o teste da condição é feito no final. Isso garante que o código seja executado pelo menos uma vez, mesmo que a condição seja falsa desde o início.

        int opcao = 0;
        do {
            System.out.println("Menu executado pelo menos uma vez.");
        } while (opcao != 0); // Condição falsa, mas rodou uma vez.

        // FOR
        // É o loop ideal quando você já sabe exatamente quantas vezes quer repetir o código. Ele agrupa a inicialização, a condição e o incremento em uma única linha.

        // (Inicialização; condição; incremento)
        for (int i = 0; i < 5; i++) {
            System.out.println("Rodada do for: " + i);
        }

        // 8. ARRAYS
        /*
            1. Tamanho Fixo: Uma vez que define o tamanho do array, ele não pode mudar. Se precisar de mais espaço, terá que criar um array novo e maior e copiar os dados.
            2. Homogêneo: Ele só aceita dados do mesmo tipo.
            3. Indexado: Cada posição do array possui um número de identificação chamado índice (index).
         */

        // Abordagem 1: Definindo apenas o tamanho (Vázio):
        double[] notas = new double[4];

        notas[0] = 8.5;
        notas[1] = 7.0;
        notas[2] = 9.2;
        notas[3] = 6.8; // Última posição (tamanho 4 - 1)

        // Abordagem 2: Inicialização direta (Com valores):
        String[] carros = {"Onix", "Civic", "HB20"};
        System.out.println(carros[1]); // Vai imprimir: Civic

        // Percorrer um array usando o for (Loops)
        int[] idades = {15, 22, 30};
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Índice " + i + " tema idade: " + idades[i]);
        }

        // Percorre um array usando o Enhanced for (ou For-Each):
        String[] frutas = {"Maçã", "Banana", "Uva", "Morango"};

        // "Para cada 'fruta' do tipo String dentro do array 'frutas'..."
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
