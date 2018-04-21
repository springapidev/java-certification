/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.app;

import com.coderbd.domain.Student;
import com.coderbd.service.GradeService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();
        studentList.add(new Student(1, "Shamim", 60, 80, 85,""));
        studentList.add(new Student(2, "Ruhul", 40, 60, 95,""));
        studentList.add(new Student(3, "Shabib", 80, 89, 83,""));
        
        for(Student s : GradeService.makeGrade(studentList)){
            System.out.println(""+s);
        }
    }
}
