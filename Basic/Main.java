class Student {
    String name;
    int age;
    int id;
    int marks;
}
public class Main {
      public static void main(String[] args) {
          Student student1 = new Student();
          student1.name = "Alice";
          student1.age = 20;
          student1.id = 101;
          student1.marks = 85;

          Student student2 = new Student();
          student2.name = "Bob";
          student2.age = 22;
          student2.id = 102;
          student2.marks = 90;

          System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", ID: " + student1.id + ", Marks: " + student1.marks);
          System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", ID: " + student2.id + ", Marks: " + student2.marks);
      }
}
