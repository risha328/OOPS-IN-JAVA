// Singleton Pattern in Java
class Singleton {
    private static Singleton instance = null;

    private Singleton() 
    {}   // private constructor

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true
    }
}
