package com.coderbd.day21.lambda.builtInMoreFunctions.ex1;


import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String []args) {
        Predicate<String> notNull =
                ((Predicate<String>)(arg -> arg == null)).negate(); // #1
        System.out.println(notNull.test(null));
    }
}
