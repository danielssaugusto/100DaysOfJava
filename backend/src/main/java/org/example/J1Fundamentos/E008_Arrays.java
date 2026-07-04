package org.example.J1Fundamentos;

public class E008_Arrays {
    static void main() {
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
