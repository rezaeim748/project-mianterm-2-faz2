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

    public String getName() {
        return name;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public String getTime() {
        return time;
    }

    public int getCapacity() {
        return capacity;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
