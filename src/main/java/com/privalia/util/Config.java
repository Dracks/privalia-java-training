package com.privalia.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Config {
    private static Config ourInstance;
    private final Properties prop;

    public static Config getInstance() throws IOException {
        if (ourInstance==null){
            ourInstance = new Config();
        }
        return ourInstance;
    }

    private Config() throws IOException {
        prop = new Properties();
        InputStream in = getClass().getClassLoader().getResourceAsStream("config.properties");
        //InputStream in = getClass().getResourceAsStream("config.properties");
        prop.load(in);
        in.close();
    }

    public String getFilename(){
        return this.prop.getProperty("filename");
    }
}
