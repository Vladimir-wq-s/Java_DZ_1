package ru.vladimir;

import java.util.Scanner;

public class Task11 {
    public static void run(Scanner scanner) {
        System.out.print("Enter line length: ");
        int length = scanner.nextInt();

        System.out.println("Select direction:");
        System.out.println("1 - Horizontal");
        System.out.println("2 - Vertical");
        System.out.print("Your choice: ");
        int dirChoice = scanner.nextInt();

        System.out.print("Enter character symbol (e.g. *, #, -): ");
        char symbol = scanner.next().charAt(0);

        boolean isHorizontal = (dirChoice == 1);
        drawLine(length, isHorizontal, symbol);
    }

    // Custom method to draw a line based on parameters
    public static void drawLine(int length, boolean isHorizontal, char symbol) {
        for (int i = 0; i < length; i++) {
            if (isHorizontal) {
                System.out.print(symbol);
            } else {
                System.out.println(symbol);
            }
        }
        if (isHorizontal) {
            System.out.println(); // New line after horizontal print
        }
    }
}
