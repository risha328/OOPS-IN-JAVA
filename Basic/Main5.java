class Student{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    public int getAge() {
        return age;
    }
}
public class Main5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Charlie");
        student.setAge(21);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }

}
