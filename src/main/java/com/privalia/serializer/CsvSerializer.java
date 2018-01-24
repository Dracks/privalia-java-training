package com.privalia.serializer;

import com.privalia.model.PrivaliaObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CsvSerializer<T extends PrivaliaObject> implements ISerializer<T> {

    @Override
    public void serialize(T obj, BufferedWriter bw) throws IOException {
        bw.write(obj.toString());
    }
    /*

    @Override
    public T load(Class<T> clazz, BufferedReader br) throws IOException {
        T r = null;
        String line = br.readLine();
        if (line != null){
            r= clazz.newInstance(line.split(","));
        }
        return r;
    }
    */
}
