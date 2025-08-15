import java.util.Scanner;

public class LadderIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");

        if (sc.hasNextInt()) {
            int marks = sc.nextInt();
            String grade = getGrade(marks);
            System.out.println(grade);
        } else {
            System.out.println("Invalid input. Please enter an integer value.");
        }

        sc.close();
    }

    public static String getGrade(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid Input";
        } else if (marks < 50) {
            return "Fail";
        } else if (marks < 60) {
            return "D Grade";
        } else if (marks < 70) {
            return "C Grade";
        } else if (marks < 80) {
            return "B Grade";
        } else if (marks < 90) {
            return "A Grade";
        } else {
            return "A+ Grade";
        }
    }
}