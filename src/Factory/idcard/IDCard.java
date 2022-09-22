package Factory.idcard;

import Factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int id;
    IDCard(String owner,int id){
        System.out.println("制作"+owner+"的ID卡");
        this.owner=owner;
        this.id = id;
    }
    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }

    public String getOwner(){
        return owner;
    }

    public int getId() {
        return id;
    }
}
