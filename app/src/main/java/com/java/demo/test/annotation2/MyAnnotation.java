package com.java.demo.test.annotation2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation在反射函数中的使用示例
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String[] value() default "unknown";
}
