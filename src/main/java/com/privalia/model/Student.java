package com.privalia.model;

public class Student extends PrivaliaObject{
    private int idStudent;
    private String name;
    private String surname;
    private int age;


    /*
     * Exemple inicialitzador static
     */
    static int numero;

    static {
        numero = 10;
    }
    // Final exemple

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Student getStudent(){
        return new Student();
    }

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

    @Override
    public String toString() {
        return Integer.toString(this.getIdStudent())+","+this.getName()+","+this.getSurname()+","+Integer.toString(this.getAge());
    }

    @Override
    public boolean equals(Object obj) {

        return (obj instanceof Student) && this.idStudent == ((Student)obj).idStudent;
    }
}
