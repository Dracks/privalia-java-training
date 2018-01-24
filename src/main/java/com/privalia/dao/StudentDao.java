package com.privalia.dao;

import com.privalia.model.Student;
import com.privalia.util.Config;
import com.privalia.util.FileUtil;
import org.apache.log4j.Logger;

import java.io.*;

public class StudentDao extends GenericDao<Student>{
    private static final Logger logger = Logger.getLogger(StudentDao.class);

    public StudentDao(String filename, FileType csv) {
        super(filename, csv);
    }


    @Override
    public int add(Student student) throws IOException {

        FileUtil.createFile(filename);


        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(filename), true))
                ;BufferedWriter bfw = new BufferedWriter(osw)) {
            this.serializer.serialize(student, bfw);
            bfw.newLine();
        } catch (IOException e){
            logger.error(e.getMessage());
            throw e;
        }
        return student.getIdStudent();
    }
}
