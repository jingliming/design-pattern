package staticProxy;

import staticProxy.impl.ILawSuit;

public class ProxyFactory {
    public  static ILawSuit getProxy() {
        return new ProxyLawyer((new SecondDogWang()));
    }
}
