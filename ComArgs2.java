public class ComArgs2 {
    public static void main(String[] args) {
        int n = 0;
        if (args.length > 0) {
            System.out.println("Table of " + args[0]);
            for (int i = 1; i <= 10; i++) {
                n = Integer.parseInt(args[0]);
                System.out.println(n + " * " + i + " = " + n * i);
            }
        } else {
            System.out.println("No command line " + "arguments found.");
        }
    }
}
