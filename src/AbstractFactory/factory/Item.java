package AbstractFactory.factory;

public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public String getCaption() {
        return caption;
    }
    public abstract String makeHTML();
}
