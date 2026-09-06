package ru.vladimir;

import java.util.Scanner;

public class Task8 {
    public static void run(Scanner scanner) {
        System.out.print("Enter start of multiplication range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of multiplication range: ");
        int end = scanner.nextInt();

        // Normalization if bounds are wrong
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
