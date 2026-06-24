package org.example.J1_fundamentos.TestesDePerformance.TP3.Exercicio001;

public class TransporteDemo {
    static void main() {
        Aviao boeing = new Aviao("Avião", "Boeing", 2019, 2);
        Aviao helicoptero = new Aviao("Helicóptero", "27000S", 2024, 6);

        boeing.ligarVeiculo();
        boeing.exibirDadosVeiculo();
        helicoptero.ligarVeiculo();
        helicoptero.exibirDadosVeiculo();
    }


}
