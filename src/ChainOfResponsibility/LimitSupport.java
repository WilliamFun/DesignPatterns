package ChainOfResponsibility;

public class LimitSupport extends Support{//解决编号小于某值的问题
    private int limit;
    public LimitSupport(String name,int limit){
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()<limit)
            return true;
        else
            return false;
    }
}
