package com.java.demo.test.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Moveable m = new Tank();
        InvocationHandler h = new LoggerHandler(m);
        //InvocationHandler th = new TranstractHandler(h);
        Moveable proxy = (Moveable) Proxy.newProxyInstance(
                m.getClass().getClassLoader(),
                m.getClass().getInterfaces(),
                h);
        proxy.move();
    }
}
