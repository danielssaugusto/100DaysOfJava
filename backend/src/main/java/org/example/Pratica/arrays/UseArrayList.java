package org.example.Pratica.arrays;

import java.util.ArrayList;

public class UseArrayList {
    static void main(String[] args) {
        // O ArrayList não aceita tipos primitivos como parâmetro.
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        names.add("John");
        names.add("Mary");
        names.add("Cole");
        System.out.println(names);

        System.out.println(names.get(1));
        System.out.println(names.size());

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Uso do for each
        for (String name : names) {
            System.out.println(name);
        }

        // Usando a lambda (::) para imprimir cada nome da lista de forma automática
        names.forEach(System.out::println);

        names.remove(2);
        names.remove("John");
        System.out.println(names);
        names.getLast();
    }
}