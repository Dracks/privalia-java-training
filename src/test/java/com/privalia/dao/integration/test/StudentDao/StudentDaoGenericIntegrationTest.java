package com.privalia.dao.integration.test.StudentDao;

import com.privalia.dao.StudentDao;
import com.privalia.model.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public abstract class StudentDaoGenericIntegrationTest {

    protected String filename;

    protected StudentDao subject;


    protected void tearDown() throws IOException {
        File f = new File(filename);
        if (f.exists()){
            f.delete();
        }
    }



    public void testCreate() throws IOException{
        Student student = getSampleData();

        subject.add(student);

        List<Student> studentsList = loadFile();
        assertEquals(1, studentsList.size());

    }


    public void testAdd() throws IOException{
        URL sampleFile = getClass().getClassLoader().getResource(getSampleFile());
        Path pathSample = new File(sampleFile.getPath()).toPath();

        Files.copy(pathSample, new FileOutputStream(filename));

        Student student = getSampleData();

        subject.add(student);

        List<Student> studentsList = loadFile();
        assertTrue(studentsList.size()>1);
        assertEquals(student, getStudent(studentsList, student.getIdStudent()));

    }


    public Student getSampleData(){
        int id = (int) Math.round(Math.random() * Integer.MAX_VALUE);
        Student student = new Student();
        student.setName("Dalek!");
        student.setIdStudent(id);
        student.setSurname("Skaro");
        student.setAge(1000);

        return student;
    }

    public Student getStudent(List<Student> studentList, int studentId) throws IOException {

        for (Student st: studentList){
            if (st.getIdStudent()==studentId){
                return st;
            }
        }
        return null;
    }

    abstract String getSampleFile();

    abstract  List<Student> loadFile() throws IOException;
}
