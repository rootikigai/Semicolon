import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "yes";

        while (choice.equals("yes")) {
            System.out.println("Enter first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter operator (+, -, *, /):");
            String operator = input.next();

            System.out.println("Enter second number:");
            double num2 = input.nextDouble();

            double result = 0;

            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else {
                System.out.println("Invalid operator. Please use +, -, *, or /.");
            }

            System.out.println("Do you want to do another calculation? (yes or no)");
            choice = input.next();
        }
    }
}

