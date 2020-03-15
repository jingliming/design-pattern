package staticProxy;

import staticProxy.impl.ILawSuit;

public class SecondDogWang implements ILawSuit {
    @Override
    public void defend() {
        System.out.println(String.format("铁证如山， %s还钱", "老板"));
    }

    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠钱跑路，证据如下: %s", proof));
    }
}
