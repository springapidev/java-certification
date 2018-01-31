/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.ch8.streamsFilter.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("india", "pak", "bd");
        List<String> result = getFilterOutput(lines, "pak");
        for (String temp : result) {
            System.out.println(temp);   
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"pak".equals(line)) { // we dont like pak
                result.add(line);
            }
        }
        return result;
    }

}
