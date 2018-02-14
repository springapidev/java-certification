package com.coderbd.day21.LambdaOperations.ch10.Listing617;
import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String []args) {
        String []string= "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::println);
    }
}
