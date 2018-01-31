/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex2;

import java.util.Arrays;
import java.util.List;
/*
The equivalent example in Java 8, use stream.filter() to filter a List, and .findAny().orElse (null) to return an object conditional.
*/
public class NowJava8 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Munna", 30),
                new Student("Emon", 20),
                new Student("Rashidul", 30)
        );

        Student result1 = students.stream()                        //List Convert to steam
                .filter(x -> "Munna".equals(x.getName()))        // we want "Munna" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1);

        Student result2 = students.stream()
                .filter(x -> "Emon".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

    }

}