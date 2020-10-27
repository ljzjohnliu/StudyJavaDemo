package com.java.demo.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("准备工作之前：");

        System.out.println("method : " + method.getName());

        //转调具体目标对象的方法
        Object object = method.invoke(this.proxied, objects);

        System.out.println("object : " + object);

        System.out.println("工作已经做完了！");
        return object;
    }


}
