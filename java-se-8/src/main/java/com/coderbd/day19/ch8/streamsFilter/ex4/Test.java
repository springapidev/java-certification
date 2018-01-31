/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex4;

/**
 *
 * @author INSTRUCTOR
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 Get all the name values from a list of the staff objects. 
 */

public class Test {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("Munna", 22, new BigDecimal(30000)),
                new Staff("Rashidul", 24, new BigDecimal(40000)),
                new Staff("Emon", 21, new BigDecimal(35000))
        );

        //Before Java 8
        List<String> result = new ArrayList<>();
        for (Staff x : staff) {
            result.add(x.getName());
        }
        System.out.println(result);

        //Java 8
        List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect);

    }

}
