class LocalVar {
    public static int findSum(int a, int b) {
        int sum = a + b; // Local Variable
        return sum;
    }

    public static void main(String[] args) {
        int a = 10, b = 20; // Local Variable
        int c = findSum(a, b);
        System.out.print(c);
    }
}