package ChainOfResponsibility;

public class NoSupport extends Support{//永远不解决问题的类
    public NoSupport(String name){
        super(name);
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
