package com.privalia.dao;

import java.io.IOException;

public interface IDao<T> {
    int add(T model) throws IOException;
}
