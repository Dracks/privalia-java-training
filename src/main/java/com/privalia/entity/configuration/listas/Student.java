package com.privalia.entity.configuration.listas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int idStudent;
    private String name;
    private String surname;
    private int age;
    private List<Teacher> teacherList;

}
