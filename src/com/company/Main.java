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
                else {
                    for (Student student : class1.getStudents()){
                        student.getClasses().remove(class1) ;
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | NullPointerException e){
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
        } catch (IOException | NullPointerException e){
        }

    }

    public static ArrayList<Student> getStudents (){
        ArrayList<Student> students = new ArrayList<>() ;
        ObjectInputStream in = null ;
        try {
            in = new ObjectInputStream(new FileInputStream(new File("./../files/students")));
        } catch (IOException e){
        }
        try {
            while (true) {
                Student student = (Student) in.readObject();
                students.add(student);
            }
        } catch (IOException | ClassNotFoundException e){
        }

        return students ;
    }

    public static ArrayList<Teacher> getTeachers (){
        ArrayList<Teacher> teachers = new ArrayList<>() ;
        ObjectInputStream in = null ;
        try {
            in = new ObjectInputStream(new FileInputStream(new File("./../files/teachers")));
        } catch (IOException e){
        }
        try {
            while (true) {
                Teacher teacher = (Teacher) in.readObject();
                teachers.add(teacher);
            }
        } catch (IOException | ClassNotFoundException e){
        }

        return teachers ;
    }

    public static Admin getAdmin (){
        Admin admin = null ;
        ObjectInputStream in = null ;
        try {
            in = new ObjectInputStream(new FileInputStream(new File("./../files/admin")));
        } catch (IOException e){
        }
        try {
            admin = (Admin) in.readObject();
        } catch (IOException | ClassNotFoundException e){
        }

        return admin ;
    }







    public static void main(String[] args) {

    }
}
