package com.privalia.entity.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component()
public class Student {
    @Value("${student.idStudent}")
    private int idStudent;
    @Value("${student.name}")
    private String name;
    @Value("${student.surname}")
    private String surname;
    @Value("${student.age}")
    private int age;

    @Autowired()
    private Address address;
}
