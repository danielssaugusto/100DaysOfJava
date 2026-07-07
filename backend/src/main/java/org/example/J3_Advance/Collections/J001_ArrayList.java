package org.example.J3_Advance.Collections;

import java.util.ArrayList;

public class J001_ArrayList {
    static void main() {
        ArrayList<String> names = new ArrayList<>();

        names.add("John"); // 0
        names.add("Mary"); // 1
        names.add("Cole"); // 2
        names.add("Adam"); // 3

        names.remove(3);
        names.remove("Adam");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names);
        System.out.println("Name index 2: " + names.get(2));
    }
}
