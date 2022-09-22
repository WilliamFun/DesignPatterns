package Factory;

import Factory.framework.Factory;
import Factory.framework.Product;
import Factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("m");
        Product product2 = factory.create("n");
        Product product3 = factory.create("h");
        product1.use();
        product2.use();
        product3.use();
    }
}
