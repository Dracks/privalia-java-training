package com.privalia.entity.annotations.listas;

import lombok.Cleanup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args){

        @Cleanup AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan(Principal.class.getPackage().getName());
        context.refresh();

        Student student = (Student) context.getBean("david3Student");
        System.out.println(student.toString());
    }
}
