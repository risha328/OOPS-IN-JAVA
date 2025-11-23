class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  boolean equals(Object obj){
        return this.id == ((Student)obj).id && this.name.equals(((Student)obj).name);
    }
    
}

public class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(101, "Alice");
        Student student3 = new Student(102, "Bob");

        System.out.println("student1 equals student2: " + student1.equals(student2)); // true
        System.out.println("student1 equals student3: " + student1.equals(student3)); // false
    }
}
