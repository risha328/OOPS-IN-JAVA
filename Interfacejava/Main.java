//interfacejava/Main.java
interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }
}
class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck started.");
    }

    public void stop() {
        System.out.println("Truck stopped.");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();

        Vehicle myTruck = new Truck();
        myTruck.start();
        myTruck.stop();
    }
}
