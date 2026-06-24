package org.example.J1_fundamentos.TestesDePerformance.TP3.Exercicio001;

public class Aviao extends Veiculo{
    private int qtdDeAsas;

    Aviao (String tipoVeiculo, String modelo, int ano, int qtdDeAsas) {
        super(tipoVeiculo, modelo, ano);
        this.qtdDeAsas = qtdDeAsas;
    }

    @Override
    public void ligarVeiculo() {
        if (qtdDeAsas == 2) {
            System.out.println("Os motores estão aquecidos.");
        } else {
            System.out.println("As hélices estão girando.");
        }
    }

    @Override
    public void exibirDadosVeiculo() {
        super.exibirDadosVeiculo();
        System.out.println("Possui: " + qtdDeAsas + " asas.");
    }
}
