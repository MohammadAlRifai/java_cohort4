package org.rbk.java.day01;

public class Student {
    static int count; // zero
    int id;
    String name  ;
    int age ;
     final double tax = 0.16;

    // constructor
    public Student(){
        count++;
    }

        // Methods overloading:
    // two methods with the same name
    // in the same class
    // with different arguments
    // constructor
    public Student(int id){

        this.id = id;
    }


    public Student(int id, String name){
        count++;
        this.id = id;
        this.name = name;
    }


    public Student(int id, String name, int age){
        count++;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getFullInfo(){
        return "ID : "+ id +" Name: " + name + " Age: " + age + " Count: "+ count ;
    }



}
