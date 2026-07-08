package org.example.J3_Advance.Exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class J002_File {
    private static final Scanner scanner = new Scanner(System.in);

    static void main() {
        int option;

        System.out.println("""
                === Menu: Manipulation File ===
                1. Create file.
                2. Delete file
                3. Copy file
                4. Move file.
                5. Display file's info.
                6. Read line by line's file.
                7. Write inside file.
                0. Quit.""");
        option = scanner.nextInt();

        switch (option) {
            case 1 -> createFile();
            case 0 -> quit();
            default -> System.out.println("Invalid option!");
        }
    }
}
