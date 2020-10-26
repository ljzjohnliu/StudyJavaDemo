package com.java.demo.test.equal;

public class EqualTest {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = new String("Hello");

        /**
         * 如果两个对象根据equals()方法比较是相等的，那么调用这两个对象中任意一个对象的hashCode方法都必须产生同样的整数结果。
         * 如果两个对象根据equals()方法比较是不相等的，那么调用这两个对象中任意一个对象的hashCode方法，则不一定要产生相同的整数结果
         */
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println(a == b);//true
        System.out.println(a.equals(b));//true

        System.out.println(a == c);//false
        System.out.println(a.equals(c));//true

        System.out.println(c == d);//false
        System.out.println(d.equals(d));//true
    }
}
