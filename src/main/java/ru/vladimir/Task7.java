package ru.vladimir;

import java.util.Scanner;

public class Task7 {
    public static void run(Scanner scanner) {
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        // Normalization if bounds are wrong
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.print("Odd numbers in range: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
