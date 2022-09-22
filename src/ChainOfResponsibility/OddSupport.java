package ChainOfResponsibility;

public class OddSupport extends Support{//解决编号是奇数的问题
    public OddSupport(String name){
        super(name);
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()%2==1)
            return true;
        else
            return false;
    }
}
