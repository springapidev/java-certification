/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex1;

/**
 *
 * @author Rajail Islam
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
The equivalent example in Java 8, stream.filter() to filter a List, and collect() to convert a stream into a List.
*/
public class NowJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("india", "pak", "bd");

        List<String> result = lines.stream() // convert list to stream
                .filter(line -> !"pak".equals(line)) // we dont like pak
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : india, bd

    }

}
