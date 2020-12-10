package com.company;

import java.io.*;
import java.util.ArrayList;

import static com.company.Main.addClassToFile;

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
        addClassToFile(class1) ;
    }

    public void removeClass (Class class1){
        classes.remove(class1) ;
    }

    public static boolean isAddingClassAllowed (Class class1){
        boolean isAllowed = true ;
        ObjectInputStream in = null ;
        try {
            in = new ObjectInputStream(new FileInputStream(new File("./../files/classes")));
        } catch (IOException e){
        }
        try {
            while (true){
                Class otherClass = (Class) in.readObject() ;
                if (((class1.getStartTime() > otherClass.getStartTime()) && (class1.getStartTime() < otherClass.getFinishTime())) || ((class1.getFinishTime() > otherClass.getStartTime()) && (class1.getFinishTime() < otherClass.getFinishTime()))){
                    isAllowed = false ;
                }
            }
        } catch (IOException | ClassNotFoundException e){
            try {
                in.close() ;
            } catch (IOException ex){
            }
        }

        return isAllowed ;
    }




}
