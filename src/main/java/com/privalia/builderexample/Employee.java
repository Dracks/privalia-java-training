package com.privalia.builderexample;

import lombok.Setter;
import lombok.ToString;
import lombok.experimental.var;

@ToString
public class Employee {

    private Long id;
    private String name;
    private int gender;
    private String address;
    private String hobby;

    private Employee() {}


    public static class EmployeeBuilder{
        private Long id;
        private String name;

        @Setter
        private int gender;
        @Setter
        private String address;
        @Setter
        private String hobby;

        public EmployeeBuilder(Long id, String name){
            this.id = id;
            this.name = name;
        }

        public Employee build(){
            Employee emp = new Employee();
            emp.id = this.id;
            emp.name = this.name;
            emp.gender = this.gender;
            emp.address = this.address;
            emp.hobby = this.hobby;
            return emp;
        }
    }
}
