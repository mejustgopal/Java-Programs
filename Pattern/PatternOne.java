package Pattern;

public class PatternOne {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i > 0; i--) {
            for(j=1;j<=i;j++)
            {
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
