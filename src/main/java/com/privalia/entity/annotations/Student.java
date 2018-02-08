package com.privalia.entity.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int idStudent;
    private String name;
    private String surname;
    private int age;
    private Address address;
}
