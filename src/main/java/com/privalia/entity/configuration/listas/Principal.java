package com.privalia.entity.configuration.listas;

import lombok.Cleanup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args){
        @Cleanup
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Student student = (Student) context.getBean("david3Student");

        System.out.println(student.toString());
    }
}
