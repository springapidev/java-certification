package com.coderbd.ex62.comparable;
public class Student implements Comparable{
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

   

    @Override
    public int compareTo(Object o) {
        double f=GPA - ((Student)o).GPA;
        if(f == 0.0 )
            return 0;
        else if (f <0.0)
            return -1;
        else 
            return 1;
    }
    
}
