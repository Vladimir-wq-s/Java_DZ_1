package ru.vladimir;

import java.util.Random;

public class Task9 {
    public static void run() {
        int[] array = new int[20];
        Random random = new Random();

        System.out.print("Generated array: ");
        for (int i = 0; i < array.length; i++) {
            // Числа от -100 до 100
            array[i] = random.nextInt(201) - 100;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        int negatives = 0;
        int positives = 0;
        int zeros = 0;

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;

            if (num < 0) negatives++;
            else if (num > 0) positives++;
            else zeros++;
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Negative elements count: " + negatives);
        System.out.println("Positive elements count: " + positives);
        System.out.println("Zeros count: " + zeros);
    }
}
