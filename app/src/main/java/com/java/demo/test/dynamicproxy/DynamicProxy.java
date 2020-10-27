package com.java.demo.test.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        HelloService proxySubject = (HelloService) Proxy.newProxyInstance(HelloService.class.getClassLoader(),
                new Class[]{HelloService.class},
                new ProxyHandler(helloService));

        proxySubject.echo("hello");
        proxySubject.getTime();
    }
}
