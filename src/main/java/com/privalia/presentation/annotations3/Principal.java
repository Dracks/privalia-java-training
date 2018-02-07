package com.privalia.presentation.annotations3;

import com.privalia.presentation.annotations.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Principal {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

        annotationContext.scan(Principal.class.getPackage().getName());
        annotationContext.refresh();

        HelloWorld helloWorld = (HelloWorld) annotationContext.getBean("helloWorld");

        System.out.println(helloWorld.getHello());

        annotationContext.close();
    }
}
