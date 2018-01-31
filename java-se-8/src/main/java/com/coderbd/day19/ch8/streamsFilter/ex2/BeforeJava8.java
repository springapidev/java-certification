/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex2;

/**
 *
 * @author Rajail Islam
 */
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Munna", 30),
                new Student("Emon", 20),
                new Student("Rashidul", 30)
        );

        Student result = getStudentByName(students, "Emonc");
        System.out.println(result);

    }

    private static Student getStudentByName(List<Student> students, String name) {

        Student result = null;
        for (Student temp : students) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}
