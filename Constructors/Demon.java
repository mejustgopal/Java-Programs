package Constructors;

class Demon {
    int value1;
    int value2;

    Demon() { // Default Constructor
        value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st Constructor");
    }

    Demon(int a) { // One Argument Constructor
        value1 = a;
        System.out.println("Inside 2nd Constructor");
    }

    Demon(int a, int b) { // Two Argument Constructor
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");
    }

    public void display() {
        System.out.println("Value1 === " + value1);
        System.out.println("Value2 === " + value2);
    }

    public static void main(String args[]) {
        Demon d1 = new Demon();
        Demon d2 = new Demon(30);
        Demon d3 = new Demon(30, 40);
        d1.display();
        d2.display();
        d3.display();
    }
}
