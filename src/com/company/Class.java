package com.company;

import java.util.ArrayList;

public class Class {
    private String name;
    private int unitsNumber ;
    private String time ;
    private int capacity ;
    private Teacher teacher ;
    private ArrayList<Student> students ;

    public Class (String name, int unitsNumber, String time, int capacity){
        this.name = name ;
        this.unitsNumber = unitsNumber ;
        this.time = time ;
        this.capacity = capacity ;
        students = new ArrayList<>() ;
    }


}
