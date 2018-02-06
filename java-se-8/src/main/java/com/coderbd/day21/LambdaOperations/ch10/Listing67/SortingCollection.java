package com.coderbd.day21.LambdaOperations.ch10.Listing67;
import java.util.Arrays;
import java.util.List;

public class SortingCollection {
    public static void main(String []args) {
        List words = 
    	Arrays.asList("follow your heart but take your brain with you".split(" "));
        words.stream().distinct().sorted().forEach(System.out::println);
    }
}

