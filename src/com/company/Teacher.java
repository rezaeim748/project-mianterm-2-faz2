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


}
