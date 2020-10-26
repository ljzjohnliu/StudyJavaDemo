package com.java.demo.test.string;

public class StringTest {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            new StringThread(String.valueOf(i), buffer, builder).start();
        }
    }
}
