package org.example.J1_fundamentos.TestesDePerformance.TP3.Exercicio002a006;

public class ProdutoDemo {
    static void main() {
        Produto pd = new Produto("Bolacha", 5.99, 50);

        pd.changeQuantity(10);
        pd.displayInformation();
    }
}
