package org.example.J3_Advance.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
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
            case 2 -> deleteFile();
            case 3 -> copyFile();
            case 4 -> moveFile();
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


    private static void deleteFile() throws IOException {
        System.out.println("File's name to delete: ");
        Path file = Path.of(scanner.nextLine());

        if (Files.exists(file)) {
            Files.delete(file);
            System.out.println("Deleted file: " + file);
        } else {
            System.out.println("File not found.");
        }
    }

    private static void copyFile() throws IOException {
        System.out.println("File's name to copy: ");
        Path origin = Path.of(scanner.nextLine());
        System.out.println("Destination file: ");
        Path destination = Path.of(scanner.nextLine());

        if (Files.exists(origin)) {
            Files.copy(origin, destination, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("Successfully moved/renamed!");
        } else {
            System.out.println("File not found.");
        }
    }

    private static void moveFile() throws IOException {
        System.out.println("File's name to copy: ");
        Path origin = Path.of(scanner.nextLine());
        System.out.println("Destination file: ");
        Path destination = Path.of(scanner.nextLine());

        Files.move(origin, destination, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println("Files successfully moved!");
    }
}
