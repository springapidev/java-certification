/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.domain.Student;
import com.coderbd.service.StudentService;

/**
 *
 * @author Instructor
 */
public class Test {

    public static void main(String[] args) {
        StudentService ss = new StudentService();
       // ss.save(new Student("Mr. Babul"));
        // ss.update(new Student(1, "Mr. Amin"));
        //ss.delete(2);
        // Student s = ss.getStudent(3);
       ///  System.out.println("ID: "+s.getId()+ " Name: "+s.getName());
    
         for (Student s : ss.getStudents()) {
         System.out.println("ID: " + s.getId() + " Name: " + s.getName());
         }
       
    }
}
