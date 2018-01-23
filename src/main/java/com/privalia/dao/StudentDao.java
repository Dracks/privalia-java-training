package com.privalia.dao;

import com.privalia.model.Student;
import com.privalia.util.Config;
import com.privalia.util.FileUtil;

import java.io.*;

public class StudentDao implements IDao<Student>{
    @Override
    public int add(Student student) throws IOException {
        String fileName = Config.getInstance().getFilename();

        FileUtil.createFile(fileName);

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(fileName), true));
        try (BufferedWriter bfw = new BufferedWriter(osw)) {
            bfw.write(student.toString());
            bfw.newLine();
        }
        return 0;
    }
}
