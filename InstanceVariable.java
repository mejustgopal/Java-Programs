public class InstanceVariable {
    String name;
    int marks;

    InstanceVariable(String StuName, int StuMarks) {
        name = StuName;
        marks = StuMarks;
    }

    // public void setMarks(int StuMarks) {
    // marks = StuMarks;
    // }

    public void printStudent() {
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {
        InstanceVariable stu1 = new InstanceVariable("Ankit", 95);
        InstanceVariable stu2 = new InstanceVariable("Anmol", 78);
        InstanceVariable stu3 = new InstanceVariable("Aniket", 69);

        // stu1.setMarks(98);
        // stu2.setMarks(59);
        // stu3.setMarks(69);

        stu1.printStudent();
        stu2.printStudent();
        stu3.printStudent();
    }
}
