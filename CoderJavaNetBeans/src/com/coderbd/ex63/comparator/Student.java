package com.coderbd.ex63.comparator;

import com.coderbd.ex62.comparable.*;

public class Student{
private String firstName, lastName;
int studentID=0;
double GPA=0.0;

    public Student(String firstName, String lastName, int studentID, double GPA) {
       if(firstName==null || lastName==null || studentID==0 || GPA==0.0){
       throw new IllegalArgumentException();
       }
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGPA() {
        return GPA;
    }

   

    
}
