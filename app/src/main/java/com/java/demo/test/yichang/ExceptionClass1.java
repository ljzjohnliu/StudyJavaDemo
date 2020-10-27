package com.java.demo.test.yichang;

import java.io.IOException;

public class ExceptionClass1 {

    public String getException() throws Exception {
        throw new Exception();
    }

    public String getIOException() throws IOException {
        throw new IOException();
    }

    public String getNullPointerException() throws NullPointerException {
        throw new NullPointerException();
    }
}
