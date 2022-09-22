package Factory.framework;

public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        RegisterProduct(product);
        return product;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void RegisterProduct(Product product);
}
