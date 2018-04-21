/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.domain.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class GradeService {

    public static List<Student> makeGrade(List<Student> students) {
        List<Student> list = new ArrayList<Student>();
        String obTainedGrade = "";
        for (Student student : students) {
            double avg = (student.getSubBengali() + student.getSubEnglish() + student.getSubMath()) / students.size();
            if (avg >= 60 && avg < 70) {
                obTainedGrade = "B";
            } else if (avg >= 70 && avg < 80) {
                obTainedGrade = "A";
            } else if (avg >= 80 && avg < 100) {
                obTainedGrade = "A+";
            } else {
                obTainedGrade = "Failed";
            }

            list.add(new Student(student.getId(), student.getName(), student.getSubBengali(), student.getSubEnglish(), student.getSubMath(), obTainedGrade));

        }

        return list;
    }
}
