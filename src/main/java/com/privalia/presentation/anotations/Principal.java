package com.privalia.presentation.anotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Principal {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        System.out.println(helloWorld.getHello());

        context.close();
    }
}
