package com.privalia.dao;

import com.privalia.model.PrivaliaObject;
import com.privalia.model.Student;
import com.privalia.serializer.CsvSerializer;
import com.privalia.serializer.ISerializer;
import com.privalia.serializer.JsonSerializer;

public abstract class GenericDao<T extends PrivaliaObject> implements IDao<Student> {

    protected final String filename;
    protected ISerializer<T> serializer;

    public GenericDao(String filename, FileType type) {
        this.filename = filename+type.toExtension();
        switch(type){
            case CSV:
                serializer = new CsvSerializer<>();
                break;
            case JSON:
                serializer = new JsonSerializer<>();
        }
    }
}
