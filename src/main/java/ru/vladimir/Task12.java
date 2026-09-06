package ru.vladimir;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void run(Scanner scanner) {
        int[] array = new int[10];
        Random random = new Random();

        System.out.print("Source array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Select sorting direction:");
        System.out.println("1 - Ascending");
        System.out.println("2 - Descending");
        System.out.print("Your choice: ");
        int sortChoice = scanner.nextInt();

        // Bubble sort technique
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                boolean condition = (sortChoice == 1) ? (array[j] > array[j + 1]) : (array[j] < array[j + 1]);
                if (condition) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
