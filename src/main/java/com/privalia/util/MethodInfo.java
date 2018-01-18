package com.privalia.util;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Pepe";
    String date();
    int revision() default 1;
    String comments();
}
