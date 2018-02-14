package com.privalia.perfiles;

import lombok.ToString;

@ToString
public class User {
    public Integer id;
    public String name;

    public User(Integer id, String name){
        this.id = id;
        this.name = name;
    }
}
