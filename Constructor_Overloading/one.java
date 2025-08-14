package Constructor_Overloading;

public class one {
    int value1;
    String name;

    one() {
        System.out.println("Hello , World!");
    }

    one(int x) {
        this.value1 = x;
    }

    one(String n) {
        this.name = n;
    }

    public void display() {
        System.out.println("Value1 ==== " + value1);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        one obj = new one();
        obj.display();

        one obj1 = new one(69);
        obj1.display();

        one obj2 = new one("Gopal");
        obj2.display();
    }
}
