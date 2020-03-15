package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DynProxyLawyer implements InvocationHandler {
    private Object target;//被代理的对象

    public DynProxyLawyer(Object obj) {
        this.target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展: " + method.getName());
        if (method.getName().equals("submit"))
            System.out.println("案件提交成功,证据如下："+ Arrays.asList(args));
        Object result = method.invoke(target, args);
        return result;
    }
}
