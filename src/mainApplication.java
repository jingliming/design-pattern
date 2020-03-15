import staticProxy.ProxyFactory;

public class mainApplication {
    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水在此");
        ProxyFactory.getProxy().defend();
    }
}
