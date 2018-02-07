package com.privalia.builderexample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Employee employee = context.getBean(Employee.class);

        System.out.println(employee);

        context.close();
    }
}
