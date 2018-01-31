/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex3;

import com.coderbd.day19.ch8.streamsFilter.ex2.Student;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Rajail Islam
 */
public class NowJava8FilterMap {
   public static void main(String[] args) {

         List<Student> students = Arrays.asList(
                new Student("Munna", 30),
                new Student("Emon", 20),
                new Student("Rashidul", 30)
        );

        String name = students.stream()
                .filter(x -> "Munna".equals(x.getName()))
                .map(Student::getName)                        //convert stream to String
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        List<String> collect = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }  
}
