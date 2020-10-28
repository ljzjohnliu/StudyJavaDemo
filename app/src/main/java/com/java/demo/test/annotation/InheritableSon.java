package com.java.demo.test.annotation;

import java.util.Date;

public class InheritableSon extends InheritableFather {

    public InheritableSon() {
        super();
        // InheritableSon类是否具有 Inheritable Annotation
        System.out.println("InheritableSon:" + InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    @SuppressWarnings(value={"deprecation", "unchecked"})
    public static void main(String[] args) {
        InheritableSon is = new InheritableSon();
        Date date = new Date(1,1,1);
    }
}
