package Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2);
        System.out.println("end");
    }
}
