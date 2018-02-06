package com.coderbd.day21.LambdaOperations.ch10.Listing610;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLengthThenNaturalReversed {
    public static void main(String []args) {
        List words = 
Arrays.asList("follow your heart but take your brain with you".split(" "));
      	Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
       	words.stream()
                .distinct()
                .sorted(lengthCompare.thenComparing(String::compareTo).reversed())
                .forEach(System.out::println);
    }
}

