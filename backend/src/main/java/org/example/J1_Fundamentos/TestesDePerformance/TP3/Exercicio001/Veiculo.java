package org.example.J1_Fundamentos.TestesDePerformance.TP3.Exercicio001;

/**
 * Enunciado: Com base no conteúdo estudado sobre Programação Orientada a Objetos em Java, elabore uma explicação clara e objetiva dos conceitos de classe, objeto, campos (ou atributos) e métodos. Em seguida, crie um exemplo simples (em pseudocódigo ou em Java) que ilustre esses conceitos na prática. Seu exemplo deve conter:
 * * Declaração de uma classe.
 * * Pelo menos dois campos (ou atributos) diferentes.
 * * Pelo menos um método que utilize ou manipule os campos da classe.
 * * Criação de um objeto a partir da classe declarada.*/

public abstract class Veiculo {
    private String tipoVeiculo;
    private String modelo;
    private int ano;

    Veiculo(String tipoVeiculo, String modelo, int ano) {
        setTipoVeiculo(tipoVeiculo);
        setModelo(modelo);
        setAno(ano);
    }

    public void ligarVeiculo() {
        System.out.println("O " + getTipoVeiculo() + ": " + getModelo() + " foi ligado.");
    }

    public void exibirDadosVeiculo() {
        System.out.println("Veiculo: " + getTipoVeiculo() + " | Modelo: " + getModelo() + "\nAno: " + getAno());
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

