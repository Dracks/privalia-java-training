package com.privalia.serializer;

import com.privalia.model.PrivaliaObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public interface ISerializer<T extends PrivaliaObject> {
    void serialize(T obj, BufferedWriter bw) throws IOException;
    // T load(BufferedReader br) throws IOException;
}
