import java.util.Scanner;

public class ConstantEx {
    // declaring constant
    public static final double PRICE = 234.90;

    public static void main(String[] args) {
        int unit;
        double total_bill;
        // PRICE = 900;

        System.out.println("Enter no of units that you have used ");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();

        sc.close();
        total_bill = PRICE * unit;

        System.out.println("Total amount that you have to deposit " + total_bill);
    }
}
