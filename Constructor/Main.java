
//Constructor chaining using this()
class Product {
    int id;
    String name;

    Product() {
        this(200, "Default Product"); // calling next constructor
    }

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();   // default -> calls parameterized
        p.show();
    }
}
