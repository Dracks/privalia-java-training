package com.privalia.dao.integration.test;

import com.privalia.dao.StudentDao;
import com.privalia.model.Student;
import com.privalia.util.Config;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class StudentDaoIntegrationTest {

    private StudentDao subject;

    @Before
    public void setUp() throws IOException {
        subject = new StudentDao();

        File f = new File(Config.getInstance().getFilename());
        if (f.exists()){
            f.delete();
        }
    }

    @After
    public void tearDown() throws IOException {
        File f = new File(Config.getInstance().getFilename());
        if (f.exists()){
            f.delete();
        }
    }


    @Test
    public void testCreate() throws IOException{
        Student student = getSampleData();

        subject.add(student);

        List<Student> studentsList = loadFile();
        assertEquals(1, studentsList.size());

    }
    @Test
    public void testAdd() throws IOException{
        URL sampleFile = getClass().getClassLoader().getResource("sample-output-student-list.csv");
        Path pathSample = new File(sampleFile.getPath()).toPath();

        Files.copy(pathSample, new FileOutputStream(Config.getInstance().getFilename()));

        Student student = getSampleData();

        subject.add(student);

        List<Student> studentsList = loadFile();
        assertTrue(studentsList.size()>1);
        assertEquals(student, studentsList.get(studentsList.size()-1));

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

    public List<Student> loadFile() throws IOException {
        List<Student> r = new LinkedList<>();
        String filename = Config.getInstance().getFilename();
        File f = new File(filename);

        assertTrue(f.exists());

        // We check the file already exists
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine())!=null){
                String[] data = line.split(",");
                Student st = new Student(Integer.valueOf(data[0]), data[1], data[2], Integer.valueOf(data[3]));
                r.add(st);
            }
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return r;
    }
}
