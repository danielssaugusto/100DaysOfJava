package org.example.J1_fundamentos.Fase02_OrientacaoAObjetos;

public class EX006_Construtores {
    /* Sumário:
    * 1. Construtor Vázio
    * 2. Construtor com parâmetros
    * 3. Sobrecarga
    * */

    // Regras do construtor:
    // Ele deve ter exatamente o mesmo nome da classe
    // Ele não tem tipo de retorno, nem mesmo void.

    // 1. CONSTRUTOR PADRÃO (VÁZIO)

    //Se você criar uma classe e não escrever nenhum construtor nela, o Java cria um automaticamente nos bastidores. Esse é o construtor padrão (ou vazio). Ele não recebe parâmetros e deixa os atributos com seus valores padrão (0, false ou null).

    public class Person {
        String name;
        int age;

        public Person() {
            // Construtor vázio: não faz nada especial ao nascer
        }
    }

    // 2. CONSTRUTOR COM PARÂMETROS
    // Muitas vezes, não faz sentido deixar um objeto nascer "vazio". Imagine uma classe Carro onde todo carro obrigatoriamente precisa ter um modelo e uma cor desde o momento em que sai da fábrica. Para isso, usamos o construtor com parâmetros.

    public class Car {
        String model;
        String color;

        public Car(String model, String color) {
            // this.model -> atributo da classe;
            // = model -> parâmetro do método.
            this.model = model; // O "this." serve para diferenciar o atributo da classe do parâmetro do método.
        }
    }

    // 3. SOBRECARGA DE CONSTRUTORES

    // Graças à sobrecarga, você tem duas opções válidas para criar produtos no seu sistema

    // Usando o construtor 1 (Vázio):
    Product product1 = new Product();
    // System.out.println(product1.name); Vai imprimir: Empty

    // Usando o construtor 2 (Com parâmetros):
    Product product2 = new Product("Snikers", 89.99);
    // System.out.println(product2.name); Vai imprimir: Snikers

    public class Product {
        String name;
        double price;

        // Construtor 1: Vázio
        public Product() {
            this.name = "Empty";
            this.price = 0.0;
        }

        // Construtor 2: Com parâmetros (Sobrecarga)
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}
