package com.java.demo.test.fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    /**
     * 1、类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * 2、类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
     */
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * 3、类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如 Object 类型的实例。
     */
    public static void getDownNumber(List<? super Number> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("xxx");
        age.add(36);
        number.add(315);

        getData(name);
        getData(age);
        getData(number);

        getUperNumber(age);
        getUperNumber(number);

        getDownNumber(number);
    }
}
