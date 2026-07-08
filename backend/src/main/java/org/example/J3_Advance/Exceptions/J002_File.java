package org.example.J3_Advance.Exceptions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class J002_File {
    private static final Scanner scanner = new Scanner(System.in);

    static void main() throws IOException {
        int option;

        do {
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
                case 5 -> displayInfo();
                case 6 -> readFile();
                case 7 -> writeFile();
                case 0 -> System.out.println("Quit...");

                default -> System.out.println("Invalid option!");
            }
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
            System.out.println("Successfully copied!");
        } else {
            System.out.println("File not found.");
        }
    }

    private static void moveFile() throws IOException {
        System.out.println("File's name to copy: ");
        Path origin = Path.of(scanner.nextLine());
        System.out.println("Destination file: ");
        Path destination = Path.of(scanner.nextLine());

        Files.move(origin, destination, StandardCopyOption.ATOMIC_MOVE);
        System.out.println("Files successfully moved/renamed!");
    }

    private static void displayInfo() throws IOException {
        System.out.println("File's name to display: ");
        Path file = Path.of(scanner.nextLine());

        if (Files.exists(file)) {
            System.out.println("Size: " + Files.size(file));

            FileTime fTime = Files.getLastModifiedTime(file);
            System.out.println("Last modified: " + fTime.to(TimeUnit.HOURS));

            System.out.println("Is directory? " + Files.isDirectory(file));

            var attrs = Files.readAttributes(file, "*");
            System.out.println("Full attributes: " + attrs);
        } else {
            System.out.println("File not found.");
        }
    }

    private static void writeFile() throws IOException {
        System.out.println("Which file do you want to write: ");
        Path file = Path.of(scanner.nextLine());

        System.out.println("Write your text and enter \"END\" to exit");
        var builder = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("END")) break;
            builder.append(line).append("\n");
        }

        Files.writeString(file, builder.toString(), StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
        System.out.println("File saved to " + file.toAbsolutePath());
    }

    private static void readFile() throws IOException {
        System.out.println("Which file do you want to read: ");
        Path file = Path.of(scanner.nextLine());

        if (Files.exists(file)) {
            List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
            lines.forEach(System.out::println);
        } else {
            System.out.println("File not found!");
        }
    }
}
