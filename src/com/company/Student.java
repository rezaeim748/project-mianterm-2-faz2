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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HashMap<Class, Integer> getClasses() {
        return classes;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public boolean[] getReservedDays() {
        return reservedDays;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public void setPassword (String password){
        this.password = password ;
    }

    public void addClass (Class class1){
        class1.getStudents().add(this) ;
        classes.put(class1, 0) ;
        unitsNumber += class1.getUnitsNumber() ;
    }

    public void setScore (Class class1, int score){
        classes.put(class1, score) ;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public void increaseCardBalance (int amount){
        cardBalance += amount ;
    }

    public void decreaseCardBalance (int amount){
        cardBalance -= amount ;
    }

    public void setReservedDays (boolean[] reservedDays){ this.reservedDays = reservedDays ; }

    public void removeClass (Class class1){
        class1.getStudents().remove(this) ;
        classes.remove(class1) ;
        unitsNumber -= class1.getUnitsNumber() ;
    }


}
