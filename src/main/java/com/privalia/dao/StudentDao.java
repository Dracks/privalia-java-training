package com.privalia.dao;

import com.privalia.model.Student;
import com.privalia.util.Config;
import com.privalia.util.FileUtil;
import org.apache.log4j.Logger;

import java.io.*;

public class StudentDao implements IDao<Student>{
    private static final Logger logger = Logger.getLogger(StudentDao.class);
    @Override
    public int add(Student student) throws IOException {
        String fileName = Config.getInstance().getFilename();

        FileUtil.createFile(fileName);

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(fileName), true));
        try (BufferedWriter bfw = new BufferedWriter(osw)) {
            bfw.write(student.toString());
            bfw.newLine();
        } catch (IOException e){
            logger.error(e.getMessage());
            throw e;
        }
        return 0;
    }
}
