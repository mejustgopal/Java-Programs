public class ComArgs1 {
    public static void main(String[] args) {
        int sum = 0;
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                sum = sum + Integer.parseInt(args[i]);
            }
            System.out.println("Sum of numbers is " + sum);
        } else {
            System.out.println("No command line " + "arguments found.");
        }
    }
}
