package com.privalia.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
public class Bug {

    private static int idCount = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated product ID")
    private  Integer id;

    @ApiModelProperty(notes = "The description of the bug")
    private String description;

    public Bug(String description){
        this.id = idCount++;
        this.description = description;
    }
}
