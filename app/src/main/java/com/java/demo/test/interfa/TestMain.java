package com.java.demo.test.interfa;

public class TestMain extends Test {
    public TestMain(String name) {
        super(name);
    }

    public static void main(String[] args) {
        System.out.println("----------------");
        TestMain tm = new TestMain("A");
        tm.fun1();
    }

    @Override
    public void fun1() {
        System.out.println("----TestMain------fun1------");
    }
}
