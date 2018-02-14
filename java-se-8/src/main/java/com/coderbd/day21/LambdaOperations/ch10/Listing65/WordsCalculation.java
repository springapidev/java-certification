package com.coderbd.day21.LambdaOperations.ch10.Listing65;
import java.util.Arrays;

public class WordsCalculation {
    public static void main(String []args) {
        String[] string = "Abstralia you never Abstralia zefo Bangaldesh know what you have zoaaa until you clean your room Australia".split(" ");
        System.out.println(Arrays.stream(string).max(String::compareTo).get());
    }
}

