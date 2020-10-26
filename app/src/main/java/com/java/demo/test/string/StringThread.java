package com.java.demo.test.string;

public class StringThread extends Thread {
    private String name;
    private StringBuffer buffer;
    private StringBuilder builder;

    public StringThread(String name, StringBuffer buffer, StringBuilder builder) {
        this.name = name;
        this.buffer = buffer;
        this.builder = builder;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            builder.append("c");
            buffer.append("c");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "]builder:" + builder.length());
        System.out.println("[" + Thread.currentThread().getName() + "]buffer:" + buffer.length());
    }
}
