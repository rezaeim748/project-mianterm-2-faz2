package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void addClassToFile (Class class1){
        ObjectOutputStream out = null ;
        try {
            out = new ObjectOutputStream(new FileOutputStream(new File("./../files/classes"))) ;
        } catch (IOException e){
        }
        try {
            out.writeObject(class1) ;
        } catch (IOException e){
            try {
                out.close() ;
            } catch (IOException ex){
            }
        }
    }

    public static void removeClassFromFile (Class class1){
        ArrayList<Class> classes = new ArrayList<>() ;
        ObjectOutputStream out = null ;
        ObjectInputStream in = null ;
        try {
            out = new ObjectOutputStream(new FileOutputStream(new File("./../files/classes"))) ;
            in = new ObjectInputStream(new FileInputStream(new File("./../files/classes")));
        } catch (IOException e){
        }
        try {
            while (true){
                Class otherClass = (Class) in.readObject() ;
                if (!otherClass.equals(class1)) {
                    classes.add(otherClass);
                }
            }
        } catch (IOException | ClassNotFoundException e){
        }
        try {
            in.close() ;
        } catch (IOException e){
        }

        try {
            PrintWriter writer = new PrintWriter("./../files/classes");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e){
        }

        try {
            for (Class class2 : classes){
                out.writeObject(class2);
            }
        } catch (IOException e){
        }
        try {
            out.close() ;
        } catch (IOException e){
        }
        
    }







    public static void main(String[] args) {

    }
}
