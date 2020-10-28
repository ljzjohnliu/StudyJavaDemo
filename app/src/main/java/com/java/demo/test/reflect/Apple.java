package com.java.demo.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Apple {

    public String name;
    private int price;

    public Apple() {

    }

    public Apple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private void privateFun() {

    }

    public static void main(String[] args) throws Exception {
        //正常的调用
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("Apple 11 Price:" + apple.getPrice());
        //使用反射调用
        //获取反射中的Class对象
        //方法1
//        Class clz = Class.forName("com.java.demo.test.reflect.Apple");
        //方法2
//        Class clz = Apple.class;
        //方法3
        Class clz = apple.getClass();

        //通过反射创建类对象
        //方法1
//        Constructor appleConstructor = clz.getConstructor();
//        Object appleObj = appleConstructor.newInstance();
        //方法2
//        Apple appleObj = (Apple) clz.newInstance();
        //方法4 调用带参数的构造函数
        Constructor appleConstructor = clz.getConstructor(String.class, int.class);
        Apple appleObj = (Apple) appleConstructor.newInstance("红富士", 8);

        //通过反射获取类属性、方法、构造器
        //通过 Class 对象的 getFields() 方法可以获取 Class 类的属性，但无法获取私有属性。

        Field[] fields = clz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Method[] methods = clz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        //而如果使用 Class 对象的 getDeclaredFields() 方法则可以获取包括私有属性在内的所有属性：
        //与获取类属性一样，当我们去获取类方法、类构造器时，如果要获取私有方法或私有构造器，则必须使用有 declared 关键字的方法。

        Field[] fields2 = clz.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field.getName());
        }

        Method[] methods2 = clz.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method.getName());
        }

        Method setPriceMethod = clz.getMethod("setPrice", int.class);
        setPriceMethod.invoke(appleObj, 6);
        Method getPriceMethod = clz.getMethod("getPrice");
        System.out.println("Apple 22 Price:" + getPriceMethod.invoke(appleObj));
    }
}
