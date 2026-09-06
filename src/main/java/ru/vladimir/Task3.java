package ru.vladimir;

import java.util.Scanner;

public class Task3 {
    public static void run(Scanner scanner) {
        System.out.print("Enter 1st digit: ");
        int d1 = scanner.nextInt();

        System.out.print("Enter 2nd digit: ");
        int d2 = scanner.nextInt();

        System.out.print("Enter 3rd digit: ");
        int d3 = scanner.nextInt();

        int number = d1 * 100 + d2 * 10 + d3;
        System.out.println("Result number: " + number);
    }
}
