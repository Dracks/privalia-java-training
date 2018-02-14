package com.privalia.perfiles;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class User {
    public Integer id;
    public String name;

    public User(Integer id, String name){
        this.id = id;
        this.name = name;
    }
}
