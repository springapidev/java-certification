package com.coderbd.day20.lambdaBuiltInFunctions.Listing54;

import java.util.Arrays;

public class FunctionUse {
    public static void main(String []args) {
   	Arrays.stream("4, -9, 16".split(", "))
		.map(Integer::parseInt)
             	.map(i -> (i < 0) ? -i : i)
             	.forEach(System.out::println);
    }
}
