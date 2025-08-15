import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        int year;

        System.out.println("Enter year : ");

        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

        sc.close();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }

    }
}