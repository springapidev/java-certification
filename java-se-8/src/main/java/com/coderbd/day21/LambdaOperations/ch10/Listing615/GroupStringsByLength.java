package com.coderbd.day21.LambdaOperations.ch10.Listing615;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStringsByLength {
    public static void main(String []args) {
        String []string= "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();
        Map<Integer, List<String>> wordGroups =
                          distinctWords.collect(Collectors.groupingBy(String::length));
wordGroups.forEach(
     		(count, words) -> {
                 	System.out.printf("word(s) of length %d %n", count);
                        	words.forEach(System.out::println);
       		});
   }
}
