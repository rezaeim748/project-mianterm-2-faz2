package com.company;

import java.util.ArrayList;

public class Teacher {
    private String username ;
    private String password ;
    private ArrayList<Class> classes ;

    public Teacher (String username, String password){
        this.username = username ;
        this.password = password ;
        classes = new ArrayList<>() ;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setPassword (String password){
        this.password = password ;
    }

    public void addClass (Class class1){
        classes.add(class1) ;
    }

    public void removeClass (Class class1){
        classes.remove(class1) ;
    }


}
