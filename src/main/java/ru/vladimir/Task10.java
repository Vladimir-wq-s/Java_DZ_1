package ru.vladimir;

import java.util.Random;

public class Task10 {
    public static void run() {
        int[] original = new int[20];
        Random random = new Random();

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        System.out.print("Original array: ");
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt(201) - 100; // From -100 to 100
            System.out.print(original[i] + " ");


            if (original[i] % 2 == 0) evenCount++;
            else oddCount++;

            if (original[i] < 0) negativeCount++;
            else if (original[i] > 0) positiveCount++;
        }
        System.out.println();


        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];
        int[] negArr = new int[negativeCount];
        int[] posArr = new int[positiveCount];

        int eIdx = 0, oIdx = 0, nIdx = 0, pIdx = 0;

        for (int num : original) {
            if (num % 2 == 0) evenArr[eIdx++] = num;
            else oddArr[oIdx++] = num;

            if (num < 0) negArr[nIdx++] = num;
            else if (num > 0) posArr[pIdx++] = num;
        }


        printArray("Even elements", evenArr);
        printArray("Odd elements", oddArr);
        printArray("Negative elements", negArr);
        printArray("Positive elements", posArr);
    }

    private static void printArray(String name, int[] arr) {
        System.out.print(name + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
