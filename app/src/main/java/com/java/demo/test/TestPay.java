package com.java.demo.test;

class TestPay {
    public static void main(String[] args) {
        Payer1 pm = new Payer1();
        IPay p = pm.startPay();
        p.pay();
    }
}
