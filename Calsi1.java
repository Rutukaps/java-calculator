package calculator;

import java.util.Scanner;

public class Calsi1 {

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static double subtract(double a, double b) {
        return a - b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n=== Basic Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int option = sc.nextInt();

            if (option == 5) {
                System.out.println(" Exiting calculator... Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (option) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println(" Thank you for using the calculator!");
        sc.close();
    }
}
