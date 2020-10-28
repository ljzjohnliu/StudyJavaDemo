package com.java.demo.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Apple {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        //正常的调用
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("Apple 11 Price:" + apple.getPrice());
        //使用反射调用
        try {
            Class clz = Class.forName("com.java.demo.test.reflect.Apple");
            Method setPriceMethod = clz.getMethod("setPrice", int.class);
            Constructor appleConstructor = clz.getConstructor();
            Object appleObj = appleConstructor.newInstance();
            setPriceMethod.invoke(appleObj, 6);
            Method getPriceMethod = clz.getMethod("getPrice");
            System.out.println("Apple 22 Price:" + getPriceMethod.invoke(appleObj));
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
