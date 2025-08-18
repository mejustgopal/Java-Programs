import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is NOT an Armstrong number.");
        }

        sc.close();
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int len = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, len);
            n /= 10;
        }

        return sum == temp;
    }
}