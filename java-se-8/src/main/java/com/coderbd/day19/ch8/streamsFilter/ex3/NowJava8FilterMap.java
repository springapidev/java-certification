package com.coderbd.day19.ch8.streamsFilter.ex3;

import com.coderbd.day19.ch8.streamsFilter.ex2.Student;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.out;
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
                .map(Student::getName) //convert stream to String
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        int age = students.stream()
                .filter(x -> "Munna".equals(x.getName()))
                .map(Student::getAge) //convert stream to String
                .findAny()
                .orElse(0);

        System.out.println("age : " + age);
        List<String> collect = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        
          List<Integer> collects = students.stream()
                .map(Student::getAge)
                .collect(Collectors.toList());

        collects.forEach(System.out::println);
        out.println("hi..........");
       
        
    }
}
