package com.java.demo.test.staticproxy;

import java.util.Date;

public class HelloServiceImpl implements HelloService {
    @Override
    public String echo(String msg) {
        return "echo:" + msg;
    }

    @Override
    public Date getTime() {
        return new Date();
    }
}
