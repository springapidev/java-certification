package com.coderbd.day21.LambdaOperations.ch10.Listing618;
import java.util.Arrays;
import java.util.List;

public class UsingMap {
    public static void main(String []args) {
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); 
  	integers.stream()
                .map(i -> i * i)
               .forEach(System.out::println);
    }
}
 
