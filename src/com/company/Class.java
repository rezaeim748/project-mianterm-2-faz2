package com.company;

import java.util.ArrayList;

public class Class {
    private String name;
    private int unitsNumber ;
    private int startTime ;
    private int finishTime ;
    private int capacity ;
    private Teacher teacher ;
    private ArrayList<Student> students ;

    public Class (String name, int unitsNumber, int startTime, int finishTime, int capacity){
        this.name = name ;
        this.unitsNumber = unitsNumber ;
        this.startTime = startTime ;
        this.finishTime = finishTime ;
        this.capacity = capacity ;
        students = new ArrayList<>() ;
    }

    public String getName() {
        return name;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getFinishTime(){
        return finishTime ;
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

    public boolean equals (Class otherClass){
        if ((this.getStartTime() == otherClass.getStartTime()) && (this.getFinishTime() == otherClass.getFinishTime()) && (this.getTeacher().getUsername().equals(otherClass.getTeacher().getUsername()))) {
            return true ;
        }
        return false ;
    }
}
