package ru.vladimir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== HOMEWORK MENU ===");
            System.out.println("1 - Task 1 (Quote)");
            System.out.println("2 - Task 2 (Percentage)");
            System.out.println("3 - Task 3 (Combine Digits)");
            System.out.println("4 - Task 4 (Swap Digits)");
            System.out.println("5 - Task 5 (Season)");
            System.out.println("6 - Task 6 (Metres Converter)");
            System.out.println("7 - Task 7 (Odd Numbers Range)");
            System.out.println("8 - Task 8 (Multiplication Table)");
            System.out.println("9 - Task 9 (Array Analysis)");
            System.out.println("10 - Task 10 (Split Array)");
            System.out.println("11 - Task 11 (Draw Line)");
            System.out.println("12 - Task 12 (Sort Array)");
            System.out.println("0 - Exit");
            System.out.print("Select a task number: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Program finished.");
                break;
            }

            switch (choice) {
                case 1:
                    Task1.run();
                    break;
                case 2:
                    Task2.run(scanner);
                    break;
                case 3:
                    Task3.run(scanner);
                    break;
                case 4:
                    Task4.run(scanner);
                    break;
                case 5:
                    Task5.run(scanner);
                    break;
                case 6:
                    Task6.run(scanner);
                    break;
                case 7:
                    Task7.run(scanner);
                    break;
                case 8:
                    Task8.run(scanner);
                    break;
                case 9:
                    Task9.run();
                    break;
                case 10:
                    Task10.run();
                    break;
                case 11:
                    Task11.run(scanner);
                    break;
                case 12:
                    Task12.run(scanner);
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }

        scanner.close();
    }
}
