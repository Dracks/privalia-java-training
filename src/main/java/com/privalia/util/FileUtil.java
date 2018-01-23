package com.privalia.util;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static synchronized boolean createFile(String file) {
        File f = new File(file);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
        }

    }

}
