/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.hashcode;

/**
 *
 * @author Rajail Islam
 */
public class Test {
    public static void main(String[] args) {
        Student student=new Student(100,"Sami");
        System.out.println("HasCode::: "+student.hashCode());
    }
}
