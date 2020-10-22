package com.java.demo.test.inner;

class TestPay {
    public static void main(String[] args) {
        Payer1 pm = new Payer1();
        IPay p = pm.startPay();
        p.pay();

        Payer2 p2 = new Payer2();
        p2.pay();
    }
}
