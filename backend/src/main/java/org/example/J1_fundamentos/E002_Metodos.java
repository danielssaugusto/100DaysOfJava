package org.example.J1_fundamentos;

public class E002_Metodos {
    /*
    * Sumário:
    * 1. Métodos: Parâmetros e Retorno
    * 4. Sobrecarga
    * 5. Escopo
    * 6. Static
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
}
