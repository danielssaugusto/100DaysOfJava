package org.example.J1Fundamentos.TestesDePerformance.TP3.Exercicio007a009;

public class ContaDemo {
    static void main() {
        Conta cp = new Conta("Jhon", 445556777, "456-78888", 999000);

        System.out.println("=== Conta Bancária ===");
        cp.displayInformationConta();
        System.out.println("***********************");
        cp.sacar(25000);
        System.out.println("***********************");
        cp.depositar(50000);
        System.out.println("***********************");
        cp.calcularRendimento();
    }
}
