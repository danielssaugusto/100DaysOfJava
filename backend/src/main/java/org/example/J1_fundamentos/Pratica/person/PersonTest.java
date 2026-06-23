package org.example.J1_fundamentos.Pratica.person;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = sc.nextLine();

        System.out.println("Your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Your weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();

        try {
            Person human = new Person(name, age, weight);
            System.out.println(human.greetingPerson());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
