package com.coderbd.day20.lambdaBuiltInFunctions.Listing51;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));//True
        System.out.println(nullCheck.test(helloStr));//True
        System.out.println(nullCheck.test(helloStr));//True

        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));//False
    }
}
