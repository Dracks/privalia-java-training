package com.privalia.entity.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component( value = "student")
@PropertySource("classpath:config.properties")
public class Student {

    @Autowired()
    @Value("${student.idStudent}")
    private int idStudent;

    @Autowired()
    @Value("${student.name}")
    private String name;

    @Autowired()
    @Value("${student.surname}")
    private String surname;

    @Autowired()
    @Value("${student.age}")
    private int age;

    @Autowired()
    @Qualifier("address")
    private Address address;
}
