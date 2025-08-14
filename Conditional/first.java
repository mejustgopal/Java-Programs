import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        byte age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age : ");

        age = sc.nextByte();

        sc.close();

        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are ineligible to vote");
        }
    }
}