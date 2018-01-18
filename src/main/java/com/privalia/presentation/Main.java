package com.privalia.presentation;

import com.privalia.model.PrivaliaObject;
import com.privalia.model.Student;
import com.privalia.util.MethodInfo;
import org.apache.log4j.Logger;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class);

    @MethodInfo(
            author="Fuck yourself",
            comments = "Other java main method",
            date="28/01/2018",
            revision = 1
    )
    public static void main(String[] args){

        Student student1 = new Student();
        student1.setIdStudent(1);
        student1.setName("pepe");
        student1.setSurname("Soto");
        student1.setAge(40);

        Student student2 = new Student(1,
                "Alberto",
                "Sierra",
                44);

        // Polimorfisme de classes
        PrivaliaObject privaliaObject = new Student();

        logger.info("Student1 Name: "+student1.getName());
        logger.info("Student2 Name: "+student2.getName());
    }
}
