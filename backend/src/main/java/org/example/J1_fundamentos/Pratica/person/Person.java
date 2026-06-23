package org.example.J1_fundamentos.Pratica.person;

public class Person {
    // Adicionando atributos à classe Person
    // Usando modificador "private" para determinar que apenas essa classe tenha acesso aos atributos
    private String personName;
    private int personAge;
    private double personWeight;

    public Person(String name, int age, double weight) {
        setPersonName(name);
        setPersonAge(age);
        setPersonWeight(weight);
    }

    public Person(String name) {
        setPersonName(name);
    }

    // Criando um método para saudação ao sistema
    // Um método possui o modificador de acesso, o tipo de retorno, o nome do método e os parâmetros.
    public String greetingPerson() {
        return "Olá, " + getPersonName() +
                "! Seja bem-vindo ao sistema. Você tem " +
                getPersonAge() + " anos de idade e pesa " +
                getPersonWeight() + "Kg.";
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonWeight() {
        return personWeight;
    }

    public void setPersonWeight(double personWeight) {
        this.personWeight = personWeight;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        if (personAge <= 0) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.personAge = personAge;
    }
}
