class Student {
    private static int count = 0; // Static variable

    Student() {
        count = count + 1; // Increment Static variable
    }

    static void Showcount() { // Static method
        System.out.println("Number of Students = " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student.Showcount();
        Student s3 = new Student();
        Student s4 = new Student();
        s4.Showcount();
    }
}