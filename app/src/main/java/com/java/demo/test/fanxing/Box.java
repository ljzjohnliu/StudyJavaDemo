package com.java.demo.test.fanxing;

/**
 * 泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。
 * 和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。
 * 一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。
 *
 * @param <T>
 */
public class Box<T, E> {

    private T t;
    private E e;

    public void add(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getT() {
        return t;
    }

    public E getE() {
        return e;
    }

    public static void main(String[] args) {
        Box<Integer, Integer> integerBox = new Box<>();
        Box<Integer, String> integerStrBox = new Box<>();
        Box<String, String> stringBox = new Box<>();

        integerBox.add(new Integer(10), new Integer(20));
        integerStrBox.add(new Integer(99), new String("Hello World too!"));
        stringBox.add(new String("Hello World!"), new String("Hello World too!"));

        System.out.printf("整型值为 :%d\n%d\n", integerBox.getT(), integerBox.getE());
        System.out.printf("混合值为 :%d\n%s\n", integerStrBox.getT(), integerStrBox.getE());
        System.out.printf("字符串为 :%s\n%s\n", stringBox.getT(), stringBox.getE());
    }
}
