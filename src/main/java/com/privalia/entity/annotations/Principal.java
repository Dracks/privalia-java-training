package com.privalia.entity.annotations;

import lombok.Cleanup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
    public static void main(String[] args){

        @Cleanup AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan(Principal.class.getPackage().getName());
        context.refresh();

        Student student = (Student) context.getBean("student");

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

        System.out.println(stringBuilder.toString());

    }
}
