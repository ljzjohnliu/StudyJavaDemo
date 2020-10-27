package com.java.demo.test.yichang;

import java.io.IOException;

public class ExceptionTest {
    public static int count = 0;

    public static void main(String[] args) {
        String ss = testExp();
        System.out.println("main ss:" + ss);
        System.out.println("main count:" + count);
    }

    /**
     * 对于try..catch捕获异常的形式来说，对于异常的捕获，可以有多个catch。对于try里面发生的异常，他会根据发生的异常和catch里面的进行匹配(按照catch块从上往下匹配)，
     * 如果有匹配的catch，它就会忽略掉这个catch后面所有的catch。
     * 如果有finally的话进入到finally里面继续执行。
     * try  ctach  fianally 中有return 时，会先执行return ，但是不会返回。在执行完 finally 后 进行返回。
     * return 的是基本类型数据时， fianlly 里面的语句不会影响 return 的值，
     * return 的是引用类型数据时，此时已经确定了要返回对象的地址（地址一），后面 fianlly 里面的可以通过修改前面地址一中的内容修改返回的内容，
     * 但是如果将对象指向另一个地址（地址二），则不会影响返回的内容。因为返回的对象地址已经确定为地址一，只能通过修改地址一对象的内容修改返回的信息。
     * @return
     */
    public static String testExp() {
        StringBuffer sb = new StringBuffer();
        ExceptionClass1 class1 = new ExceptionClass1();
        try {
            sb.append("step0,");
            class1.getNullPointerException();
            sb.append("step1,");
            class1.getIOException();
            sb.append("step2,");
            class1.getException();
            sb.append("step3,");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException e:" + e);
            e.printStackTrace();
            sb.append("NullPointerException,");
            count = 1;
            return sb.toString();
        } catch (IOException e) {
            System.out.println("IOException e:" + e);
            e.printStackTrace();
            sb.append("IOException,");
            count = 2;
            return sb.toString();
        } catch (Exception e) {
            System.out.println("Exception e:" + e);
            e.printStackTrace();
            sb.append("Exception,");
            count = 3;
            return sb.toString();
        } finally {
            System.out.println("I am in finally!");
            sb.append("finally!");
            count = 4;
        }
        return "No Exception!!!";
    }
}
