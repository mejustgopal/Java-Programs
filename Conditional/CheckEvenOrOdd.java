import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no : ");
        num = sc.nextInt();

        sc.close();

        // String result = (num & 1) == 0 ? "Even" : "Odd";
        // String result = (num & 1) == 1 ? "Odd" : "Even";

        // System.out.println(num + " is " + result);


        if (num%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
