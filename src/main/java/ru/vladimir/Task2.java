package ru.vladimir;

import java.util.Scanner;

public class Task2 {
    public static void run(Scanner scanner) {
        System.out.print("Enter number: ");
        double value = scanner.nextDouble();

        System.out.print("Enter percentage: ");
        double percent = scanner.nextDouble();

        double result = (value * percent) / 100;
        System.out.println("Result: " + result);
    }
}
