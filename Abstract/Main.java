
//Abstract class example
    
abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    public Circle(double radius) {
            this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    
}
class Rectangle extends Shape {
    double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
class square extends Shape {
    double side;
    public square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new square(4);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
