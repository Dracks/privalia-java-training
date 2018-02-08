package com.privalia.entity.configuration;

import lombok.Cleanup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

    static String getString(Student student) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(student.getIdStudent());
        stringBuilder.append(" ");
        stringBuilder.append(student.getName());
        stringBuilder.append(" ");
        stringBuilder.append(student.getSurname());
        stringBuilder.append(" ");
        stringBuilder.append(student.getAge());
        stringBuilder.append(" ");
        stringBuilder.append(student.getAddress().getIdAddress());
        stringBuilder.append(" ");
        stringBuilder.append(student.getAddress().getStreet());
        return stringBuilder.toString();
    }
    public static void main(String[] args){

        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Student student = (Student) context.getBean("student");


        System.out.println(getString(student));

        Student studentConstructor = (Student) context.getBean("studentConstructor");

        System.out.println(getString(studentConstructor));

    }
}
