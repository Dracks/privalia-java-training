package com.privalia.model;

import lombok.Getter;
import lombok.Setter;

public class Student extends PrivaliaObject{
    @Getter @Setter
    private int idStudent;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String surname;
    @Getter @Setter
    private int age;

    public Student(){
        super();
    }

    public Student(int idStudent, String name, String surname, int age) {
        super();
        this.idStudent = idStudent;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String[] data){
        super(data);
        this.idStudent = Integer.valueOf(data[1].trim());
        this.name = data[2].trim();
        this.surname = data[3].trim();
        this.age = Integer.valueOf(data[4].trim());

    }

    @Override
    public String toString() {
        return super.toString()+","+Integer.toString(this.getIdStudent())+","+this.getName()+","+this.getSurname()+","+Integer.toString(this.getAge());
    }
}
