/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day8.inheritance;

/**
 *
 * @author Instructor
 */
// child class or sub class
public class B extends A{
    private String email;

    public B() {
    }

    public B(int id, String email) {
        super(id);
        this.email=email;
    }

    public B(int id) {
        super(id);
    }

    public B(String name) {
        super(name);
    }

    @Override
    public void display(){
        System.out.println("::: I am from class B :::");    
    }

    public String getEmail() {
        return email;
    }
    
}
