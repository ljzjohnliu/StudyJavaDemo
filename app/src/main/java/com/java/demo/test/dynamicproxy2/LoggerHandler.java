package com.java.demo.test.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerHandler implements InvocationHandler {

    private Object obj;

    public LoggerHandler(Object obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志开始");
        Object result = method.invoke(this.obj, args);
        System.out.println("日志结束");
        return result;
    }

}
