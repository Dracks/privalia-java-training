package com.privalia.dao;

import com.privalia.model.PrivaliaObject;
import com.privalia.model.Student;
import com.privalia.serializer.CsvSerializer;
import com.privalia.serializer.ISerializer;

public abstract class GenericDao<T extends PrivaliaObject> implements IDao<Student> {

    protected final String filename;
    protected ISerializer<T> serializer;

    public GenericDao(String filename, FileType csv) {
        this.filename = filename;
        switch(csv){
            case CSV:
                serializer = new CsvSerializer<T>();
                break;
        }
    }
}
