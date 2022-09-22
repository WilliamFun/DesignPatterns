package Factory.idcard;

import Factory.framework.Factory;
import Factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private Map<Integer,String> owners = new HashMap<>();
    private int id = 100;

    @Override
    protected synchronized Product createProduct(String owner) {//防止多线程同时访问该方法
        return new IDCard(owner,id++);
    }

    @Override
    protected void RegisterProduct(Product product) {
        owners.put(((IDCard)product).getId(),((IDCard)product).getOwner());
    }
    public Map<Integer,String> getOwners(){
        return owners;
    }

    public int getId() {
        return id;
    }
}
