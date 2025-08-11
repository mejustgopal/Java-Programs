import java.util.Scanner;

public class ScannerClass {
    // Fields
    private String name, gender;
    private byte age;
    private int qty;
    private double rate;
    private boolean status;

    // Method to take input
    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = input.nextLine();

        System.out.print("Enter Your Gender: ");
        gender = input.nextLine();

        System.out.print("Enter Your Age: ");
        age = input.nextByte();
        while (age < 0 || age > 120) {
            System.out.print("Please enter a valid age (0–120): ");
            age = input.nextByte();
        }

        System.out.print("Enter Item Quantity: ");
        qty = input.nextInt();
        while (qty < 0) {
            System.out.print("Quantity cannot be negative. Enter again: ");
            qty = input.nextInt();
        }

        System.out.print("Enter Rate (Double) of Item: ");
        rate = input.nextDouble();

        System.out.print("Are you above 18? (true/false): ");
        status = input.nextBoolean();

        input.close(); // Close scanner to prevent resource leak
    }

    // Method to display output
    public void display() {
        System.out.println("\n----- User Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Gender     : " + gender);
        System.out.println("Age        : " + age);
        System.out.println("Quantity   : " + qty);
        System.out.println("Rate       : " + rate);
        System.out.println("Status     : " + (status ? "You are above 18" : "You are under 18"));
    }

    // Main method
    public static void main(String[] args) {
        ScannerClass obj = new ScannerClass();
        obj.input();
        obj.display();
    }
}