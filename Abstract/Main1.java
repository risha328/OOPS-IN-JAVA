//Abstract Class Payment → UPI, Card, COD

abstract class Payment {
    abstract void pay(int amount);
}

class UPI extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Card extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class COD extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash On Delivery");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1000);

        p = new COD();
        p.pay(750);
    }
}
