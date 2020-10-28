package com.java.demo.test.annotation;

public class InheritableSon extends InheritableFather {

    public InheritableSon() {
        super();
        // InheritableSon类是否具有 Inheritable Annotation
        System.out.println("InheritableSon:" + InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    public static void main(String[] args) {
        InheritableSon is = new InheritableSon();
    }
}
