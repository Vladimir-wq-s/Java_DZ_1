package ru.vladimir;

import java.util.Scanner;

public class Task6 {
    public static void run(Scanner scanner) {
        System.out.print("Enter meters amount: ");
        double meters = scanner.nextDouble();

        System.out.println("Select unit for conversion:");
        System.out.println("1 - Miles");
        System.out.println("2 - Inches");
        System.out.println("3 - Yards");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double miles = meters * 0.000621371;
                System.out.println(meters + " meters = " + miles + " miles");
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println(meters + " meters = " + inches + " inches");
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println(meters + " meters = " + yards + " yards");
                break;
            default:
                System.out.println("Error: Invalid choice!");
        }
    }
}
