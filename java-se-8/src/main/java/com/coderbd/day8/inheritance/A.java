package com.coderbd.day8.inheritance;

/**
 *
 * @author Instructor
 */
//Super class or parent 
public class A {
    public int id;
    public String name;

    public A() {
    }

    public A(int id) {
        this.id = id;
    }

    public A(String name) {
        this.name = name;
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

   
    
    public void display(){
        System.out.println("::: I am from class A :::");    
    }
}
