/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public class NowJava8Multiple {
  public static void main(String[] args) {

         List<Student> students = Arrays.asList(
                new Student("Munna", 30),
                new Student("Emon", 20),
                new Student("Rashidul", 30)
        );

        Student result1 = students.stream()
                .filter((p) -> "Rashidul".equals(p.getName()) && 30 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result 1 :" + result1);

        //or like this
        Student result2 = students.stream()
                .filter(p -> {
                    if ("Munna".equals(p.getName()) && 30 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println("result 2 :" + result2);

    }   
}
