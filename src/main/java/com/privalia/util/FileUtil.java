package com.privalia.util;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

@Log4j
public class FileUtil {

    public static synchronized boolean createFile(String file) throws IOException {
        boolean isFileCreated=false;
        File f = new File(file);
        if (!f.exists()) {
            try {
                isFileCreated = f.createNewFile();
            } catch (IOException e) {
                log.error(e.getMessage());
                throw e;
            }
        }
        return isFileCreated;

    }

}
