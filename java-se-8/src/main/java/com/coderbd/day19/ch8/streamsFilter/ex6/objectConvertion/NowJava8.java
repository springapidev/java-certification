/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex6.objectConvertion;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("Munna", 30, new BigDecimal(10000)),
                new Staff("Zunaid", 27, new BigDecimal(20000)),
                new Staff("Rashidul", 33, new BigDecimal(30000))
        );

		// convert inside the map() method directly.
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("Zunaid".equals(temp.getName())) {
                obj.setExtra("this field is for Zunaid only!");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);

    }

}