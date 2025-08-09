class Autoboxing {
    public static void main(String args[]) {
        int a = 50;
        // Integer a2=new Integer(a);// Manual Boxing (deprecated)
        // Integer a3 = 5;// Boxing
        Integer a3=Integer.valueOf(a);
        System.out.println(a + " " + a3);
    }
}