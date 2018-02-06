package com.coderbd.day21.LambdaOperations.ch10.Listing614;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsToTreeSet {
    public static void main(String []args) {
        String []roseQuote = "a rose is a rose is a rose".split(" ");
        Set words = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
        words.forEach(System.out::println);
    }
}
