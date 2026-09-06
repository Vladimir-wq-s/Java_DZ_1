package ru.vladimir;

import java.util.Scanner;

public class Task5 {
    public static void run(Scanner scanner) {
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Error: Invalid month range!");
            return;
        }

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
