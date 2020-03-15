package proxy;

import proxy.impl.ILawSuit;

public class ProxyLawyer implements ILawSuit {
    ILawSuit plaintiff;//持有要求代理的哪个对象

    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff = plaintiff;
    }

    @Override
    public void submit(String proof) {
        this.plaintiff.submit(proof);
    }

    @Override
    public void defend() {
        this.plaintiff.defend();
    }
}
