import proxy.ProxyFactory;
import proxy.dynamicProxy.CuiHuaNiu;
import proxy.impl.ILawSuit;

public class mainApplication {
    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水在此");
        ProxyFactory.getProxy().defend();
        ILawSuit proxy = (ILawSuit) ProxyFactory.getDynProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
