package com.privalia.entity.annotations.listas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    private int idTeacher;
    private String name;
}
