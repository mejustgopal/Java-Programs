import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int age, weight;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age : ");

        age = sc.nextInt();

        if (age > 18) {
            System.out.println("Enter Your weight : ");

            weight = sc.nextInt();

            if (weight > 50) {
                System.out.println("Cheers! You can donate blood");
            } else {
                System.out.println("You are underweight!");
            }
        } else {
            System.out.println("Sorry! You are underAge");
        }
        sc.close();
    }
}
