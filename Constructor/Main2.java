//Calling Parent Constructor Using super()
class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}
class Dog extends Animal {
    Dog() {
        super(); // calling parent constructor
        System.out.println("Dog is created");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
