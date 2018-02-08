package com.privalia.entity.annotations.listas;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component("david3Student")
public class Student {

    @Value("1")
    private int idStudent;

    @Value("Dr")
    private String name;

    @Value("Strange")
    private String surname;

    @Value("31")
    private int age;

    @Autowired
    private List<Teacher> teacherList;

    @Bean("teacherList")
    private static List<Teacher> getTeacherList(){
        val r=new LinkedList<Teacher>();
        r.add(new Teacher(0, "Dr Who"));
        r.add(new Teacher(1, "I don't know"));
        return r;
    }

}
