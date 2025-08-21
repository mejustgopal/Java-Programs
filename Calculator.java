import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input: Operator
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Input: Second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Switch-case for operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        scanner.close();
    }
}