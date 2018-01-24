package com.privalia.dao.integration.test.StudentDao;

import com.privalia.dao.FileType;
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

public class StudentDaoCsvIntegrationTest {

    private String filename;

    private StudentDao subject;

    @Before
    public void setUp() throws IOException {

        filename = Config.getInstance().getFilename();

        subject = new StudentDao(filename, FileType.CSV);

        filename = filename +".csv";

        File f = new File(filename);
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
        System.out.println(student.getUuid());

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

    public List<Student> loadFile() throws IOException {
        List<Student> r = new LinkedList<>();
        File f = new File(filename);

        assertTrue(f.exists());

        // We check the file already exists
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine())!=null){
                String[] data = line.split(",");
                Student st = new Student(data);
                r.add(st);
            }
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return r;
    }
}
