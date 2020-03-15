package proxy;

import proxy.dynamicProxy.DynProxyLawyer;
import proxy.impl.ILawSuit;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    public static ILawSuit getProxy() {
        return new ProxyLawyer((new SecondDogWang()));
    }

    public static Object getDynProxy(Object target) {
        InvocationHandler handler = new DynProxyLawyer(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }
}
