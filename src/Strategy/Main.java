package Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("Add"+context.executeStrategy(10,5));
        context = new Context(new Subtract());
        System.out.println("Subtract:"+context.executeStrategy(10,5));
        context = new Context(new Multiply());
        System.out.println("Multiply:"+context.executeStrategy(10,5));
    }
}
