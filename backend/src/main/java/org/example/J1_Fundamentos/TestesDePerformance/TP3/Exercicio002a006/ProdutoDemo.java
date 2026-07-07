package org.example.J1_Fundamentos.TestesDePerformance.TP3.Exercicio002a006;

public class ProdutoDemo {
    static void main() {
        Produto pd = new Produto("Bolacha", 5.99, 50);

        pd.changePrice(7.89);
        pd.changeQuantity(10);
        pd.displayInformation();
        pd.increaseQuantity(12);
        pd.displayInformation();
        pd.decrementQuantity(5);
    }
}
