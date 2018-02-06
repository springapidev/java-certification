package com.coderbd.day21.LambdaOperations.ch10.Listing65;
import java.util.Arrays;

public class WordsCalculation {
    public static void main(String []args) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        System.out.println(Arrays.stream(string).min(String::compareTo).get());
    }
}

