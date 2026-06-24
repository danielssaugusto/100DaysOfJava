package org.example.J1_fundamentos.TestesDePerformance.TP3.Exercicio002a006;

public class Produto {
    private String name;
    private double price;
    private int quantityInStock;

    Produto(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void changePrice(double newPrice) {
        System.out.println("Preço atual: " + getPrice());
        if (newPrice != price) {
            setPrice(newPrice);
        } else {
            System.out.println("O novo preço é igual o preço atual.");
        }
    }

    public void changeQuantity(int newQuantity) {
        System.out.println("Estoque atual: " + quantityInStock);
        setQuantityInStock(newQuantity);
    }

    public void displayInformation() {
        System.out.println("=== ESTOQUE ===");
        System.out.println("Nome do produto: " + getName() + "\nPreço: R$" + getPrice() + "\nQuantidade em estoque: " + getQuantityInStock());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock > 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("O estoque não pode ficar negativo.");
        }
    }
}
