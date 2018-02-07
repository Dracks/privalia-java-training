package com.privalia.exercice;

import com.privalia.exercice.operations.IOperations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Calculator {
    AnnotationConfigApplicationContext context;

    public Calculator(){
        context = new AnnotationConfigApplicationContext();
        context.scan(this.getClass().getPackage().getName());
        context.refresh();
    }

    public int calc(String[] args){
        return ((IOperations) context.getBean(args[1])).calc(Integer.valueOf(args[0]), Integer.valueOf(args[2]));
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.calc(args));
    }
}
