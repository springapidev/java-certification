package com.coderbd.day20.lambdaBuiltInFunctions.Listing52;

import java.util.List;
import java.util.ArrayList;

public class RemoveIfMethod {
    public static void main(String []args) {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("hworld");

        greeting.removeIf(str -> !str.startsWith("h"));
        greeting.forEach(System.out::println);
    }
} 
