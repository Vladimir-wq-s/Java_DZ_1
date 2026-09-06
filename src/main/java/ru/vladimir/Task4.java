package ru.vladimir;

import java.util.Scanner;

public class Task4 {
    public static void run(Scanner scanner) {
        System.out.print("Enter a 6-digit number: ");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Error: Not a 6-digit number!");
            return;
        }

        int d1 = number / 100000;
        int d2 = (number / 10000) % 10;
        int d3 = (number / 1000) % 10;
        int d4 = (number / 100) % 10;
        int d5 = (number / 10) % 10;
        int d6 = number % 10;

        int result = d6 * 100000 + d5 * 10000 + d3 * 1000 + d4 * 100 + d2 * 10 + d1;

        System.out.println("Transformation result: " + result);
    }
}
