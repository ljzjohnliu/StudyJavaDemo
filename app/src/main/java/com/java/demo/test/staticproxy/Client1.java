package com.java.demo.test.staticproxy;

public class Client1 {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy(helloService);
        System.out.println(helloServiceProxy.echo("hello"));
    }
}
