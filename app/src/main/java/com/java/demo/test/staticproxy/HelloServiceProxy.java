package com.java.demo.test.staticproxy;

import java.util.Date;

public class HelloServiceProxy implements HelloService {

    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String echo(String msg) {
        //预处理
        System.out.println("before calling echo()");
        //调用被代理的HelloService 实例的echo()方法
        String result = helloService.echo(msg);
        //事后处理
        System.out.println("after calling echo()");
        return result;
    }

    @Override
    public Date getTime() {
        //预处理
        System.out.println("before calling getTime()");
        //调用被代理的HelloService 实例的getTime()方法
        Date date = helloService.getTime();
        //事后处理
        System.out.println("after calling getTime()");
        return date;
    }
}
