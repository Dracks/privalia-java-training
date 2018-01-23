package com.privalia.util;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;


public class FileUtil {

    static final Logger logger = Logger.getLogger(FileUtil.class);

    public static synchronized boolean createFile(String file) throws IOException {
        boolean isFileCreated=false;
        File f = new File(file);
        if (!f.exists()) {
            try {
                isFileCreated = f.createNewFile();
            } catch (IOException e) {
                logger.error(e.getMessage());
                throw e;
            }
        }
        return isFileCreated;

    }

}
