package com.privalia.serializer;

import com.google.gson.Gson;
import com.privalia.model.PrivaliaObject;

import java.io.BufferedWriter;
import java.io.IOException;

public class JsonSerializer<T extends PrivaliaObject> implements ISerializer<T>{

    private final Gson gson;

    public JsonSerializer(){
        gson = new Gson();
    }

    @Override
    public void serialize(T obj, BufferedWriter bw) throws IOException {
        bw.write(gson.toJson(obj));
        bw.newLine();
    }
}
