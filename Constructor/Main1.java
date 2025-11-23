class Student {
    String name;
    int age;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
    } // Default constructor

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    } // Parameterized constructor

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    } // Copy constructor
}
public class Main1 {
    public static void main(String[] args) {
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Alice", 20); // Parameterized constructor
        Student student3 = new Student(student2); // Copy constructor

        System.out.println("Student 1: Name = " + student1.name + ", Age = " + student1.age);
        System.out.println("Student 2: Name = " + student2.name + ", Age = " + student2.age);
        System.out.println("Student 3: Name = " + student3.name + ", Age = " + student3.age);
    }
}
