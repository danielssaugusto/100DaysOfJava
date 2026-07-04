package org.example.J1Fundamentos;

public class E009_Metodos {
    /*
    * Sumário:
    * 1. Métodos: Parâmetros e Retorno
    * 2. Sobrecarga
    * 3. Escopo
    * 4. Static
    * */

    // 1. MÉTODOS: PARâMETROS E RETORNO
    // Um método é um bloco de código que executa uma tarefa específica. Pense nele como uma "função" ou uma "fábrica": ele pode receber uma matéria-prima (parâmetros), processá-la e entregar um produto final (retorno).

    // Estrutura de método:
    // Modificadores | Tipo de Retorno | Nome do Método | (Parâmetros)
    public int somar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado; // Retorno do dado;
    }

    /*
        Parâmetros: São as variáveis que o método precisa para funcionar. No exemplo acima, numero1 e numero2. Se um método não precisa de nada, os parênteses ficam vazios: ().

        Retorno: É o resultado que o método devolve para quem o chamou. O tipo do retorno deve ser especificado antes do nome do método (neste caso, int).

        O que é void? Se um método apenas faz uma ação (como imprimir algo na tela) e não devolve nenhum valor para ser guardado em uma variável, usamos a palavra-chave void (vazio).
     */

    // Método com void (sem retorno) e sem parâmetros:
    public void exibirMensagemBoasVindas() {
        System.out.println("Bem-vindo ao sistema.");
    }

    // 2. SOBRECARGA DE MÉTODOS (OVERLOAD)
    // A sobrecarga acontece quando você cria dois ou mais métodos com o mesmo nome, mas com parâmetros diferentes (seja em quantidade ou em tipo) dentro da mesma classe. O Java sabe qual método chamar baseando-se nos argumentos que você passa.

    public class Calculadora {
        // Versão 1: Soma dois inteiros
        public int somar(int a, int b) {
            return a + b;
        }

        // Versão 2: Sobrecarga para somar três inteiros
        public int somar(int a, int b, int c) {
            return a + b + c;
        }

        // Versão 3: Sobrecarga para somar números decimais (double)
        public double somar(double a, double b) {
            return a + b;
        }
    }

    // 3. ESCOPO
    // O escopo define a "vida" e a visibilidade de uma variável. Em Java, uma regra prática e visual é: a variável só existe dentro das chaves { } onde ela foi declarada.

    // Exemplo:
    public class ExemploEscopo {
        int variavelGlobal = 10; // Escopo da Classe (visível em toda a classe)

        public void meuMetodo() {
            int variavelLocal = 5; // Escopo do Método

            System.out.println(variavelGlobal); // Funciona!
            System.out.println(variavelLocal);  // Funciona!

            if (variavelLocal > 0) {
                int variavelDoIf = 20; // Escopo do Bloco IF
                System.out.println(variavelDoIf); // Funciona!
            }

            // System.out.println(variavelDoIf); // ERRO! A variável morreu quando o IF fechou.
        }

        public void outroMetodo() {
            // System.out.println(variavelLocal); // ERRO! Não pertence a este método.
        }
    }

    // 4. MODIFICADOR STATIC

    // A palavra-chave static indica que um método ou atributo pertence à Classe em si, e não a um objeto específico criado a partir dela.

    // Sem static (Instância):
    // Você precisa usar o comando new para criar um objeto antes de usar o método.
    // Para usar o método da String, precisamos de uma instância
    String texto = new String("olá");
    // texto.toUpperCase();

    // Com static (Classe):
    // Você não precisa criar um objeto com new. Você chama o método diretamente pelo nome da Classe.

    // O método sqrt (raiz quadrada) da classe Math é estático
    double raiz = Math.sqrt(25); // Chamado direto da classe Math

}
