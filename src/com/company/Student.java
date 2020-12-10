package com.company;

import java.util.HashMap;

public class Student {
    private String username ;
    private String password ;
    private HashMap<Class,Integer> classes ;
    private String cardNumber ;
    private String cardPassword ;
    private int cardBalance ;
    private boolean[] reservedDays ;
    private int unitsNumber ;

    public Student (String username, String password){
        this.username = username ;
        this.password = password ;
        classes = new HashMap<>() ;
        cardNumber = "" ;
        cardPassword = "" ;
        cardBalance = 0 ;
        reservedDays = new boolean[7] ;
        unitsNumber = 0 ;
    }


}
