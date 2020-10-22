package com.java.demo.test;

/**
 * Payer类和IPay接口有相同的方法pay()，然后我们有如下实现方法：
 */
public class Payer2 extends Payer implements IPay {

    /**
     * 想问一下大家pay()这个方法是属于覆盖Payer这里的方法呢？还是IPay这里的方法。我怎么能调到Payer这里的方法？显然这是不好区分的。而我们如果用内部类就很好解决这一问题了。看下面代码
     */
    @Override
    public void pay() {
        System.out.println("pay ing...");
    }
}
