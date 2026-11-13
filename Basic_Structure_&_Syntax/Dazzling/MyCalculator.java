import java.util.Scanner;

public class MyCalculator {

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
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double square(double a) {
        return a * a;
    }

    public static double bmi(double height, double weight) {
        return weight / (height * height);
    }


    // THIS is the main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MY CALCULATOR ===");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        System.out.println("[5] Modulus");
        System.out.println("[6] Average");
        System.out.println("[7] Max");
        System.out.println("[8] Square");
        System.out.println("[9] BMI");

        System.out.print("Choose an operation: ");
        int choice = scanner.nextInt();


        // =========================
        // BMI
        // =========================
        if (choice == 9) {

            scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your height (in meters): ");
            double height = scanner.nextDouble();

            System.out.print("Enter your weight (in kilograms): ");
            double weight = scanner.nextDouble();

            double result = bmi(height, weight);

            System.out.println("\n===== BMI RESULT =====");
            System.out.println("Name   : " + name);
            System.out.println("Age    : " + age);
            System.out.println("Height : " + height + " m");
            System.out.println("Weight : " + weight + " kg");
            System.out.printf("BMI    : %.2f\n", result);

            if (result < 18.5) {
                System.out.println("Category: Wasted (Underweight)");
            } else if (result < 25.0) {
                System.out.println("Category: Normal");
            } else if (result < 30.0) {
                System.out.println("Category: Overweight");
            } else {
                System.out.println("Category: Obese");
            }


        // =========================
        // NORMAL CALCULATOR
        // =========================
        } else {

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            if (choice == 8) {

                double result = square(num1);
                System.out.println("Result: " + result);

            } else {

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                if (choice == 1) {
                    System.out.println("Result: " + add(num1, num2));

                } else if (choice == 2) {
                    System.out.println("Result: " + subtract(num1, num2));

                } else if (choice == 3) {
                    System.out.println("Result: " + multiply(num1, num2));

                } else if (choice == 4) {
                    System.out.println("Result: " + divide(num1, num2));

                } else if (choice == 5) {
                    System.out.println("Result: " + modulus(num1, num2));

                } else if (choice == 6) {
                    System.out.println("Result: " + average(num1, num2));

                } else if (choice == 7) {
                    System.out.println("Result: " + max(num1, num2));

                } else {
                    System.out.println("Invalid code");
                }
            }
        }

        scanner.close();
    }
}