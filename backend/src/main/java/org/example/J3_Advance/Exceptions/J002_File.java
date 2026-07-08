package org.example.J3_Advance.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class J002_File {
    private static final Scanner scanner = new Scanner(System.in);

    static void main() throws IOException {
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
                0. Quit.
                Enter a option: """);
        option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1 -> createFile();
            case 0 -> System.out.println("Quit...");

            default -> System.out.println("Invalid option!");
        } while (option != 0);
    }

    private static void createFile() throws IOException {
        System.out.println("File's name to create: ");
        Path file = Path.of(scanner.nextLine());

        Files.createFile(file);
        System.out.println("File created: " + file.toAbsolutePath());
    }
}
