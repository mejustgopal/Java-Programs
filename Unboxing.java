public class Unboxing {
    public static void main(String[] args) {
        // Wrapper objects already created (could come from anywhere)
        Integer obj1 = Integer.valueOf(100);
        Double obj2 = Double.valueOf(55.5);
        Boolean obj3 = Boolean.TRUE;

        // Pure unboxing: wrapper → primitive
        int num1 = obj1;       // obj1.intValue()
        double num2 = obj2;    // obj2.doubleValue()
        boolean flag = obj3;   // obj3.booleanValue()

        System.out.println("int value: " + num1);
        System.out.println("double value: " + num2);
        System.out.println("boolean value: " + flag);
    }
}
