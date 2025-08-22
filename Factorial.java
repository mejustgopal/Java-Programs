import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    // Function to calculate factorial using BigInteger
    public static BigInteger calculateFactorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is " + result);
        }

        s.close();
    }
}