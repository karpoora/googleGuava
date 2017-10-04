package com.learning.java.model;

import lombok.Data;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
public class Subject {

    public Subject(){

    }

    public Subject(String name,String id){
        this.name=name;
        this.id=id;
    }

    private String name;
    private String id;
}
