class Student{
    static int count = 0;

    public Student() {
        count++;
        System.out.println("Student object created. Total students: " + count);
    }
    
}
public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
    }
}
