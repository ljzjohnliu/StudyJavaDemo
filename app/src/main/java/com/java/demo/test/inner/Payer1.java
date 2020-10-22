package com.java.demo.test.inner;

public class Payer1 extends Payer {

    private class InnerPayer implements IPay {
        public void pay() {
            Payer1.this.pay();
        }
    }

    IPay startPay() {
        return new InnerPayer();
    }
}
