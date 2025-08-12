public class ComArgs3 {
    public static void main(String str[]) {
        if (str.length == 0) {
            System.out.println("Please provide one or more numbers as command-line arguments.");
            return;
        }

        for (String s : str) {
            try {
                int n = Integer.parseInt(s);
                System.out.println("Table of " + n);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " * " + i + " = " + (n * i));
                }
                System.out.println("-----------------------------");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input '" + s + "'. Please enter valid integers.");
            }
        }
    }
}