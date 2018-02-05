package com.coderbd.day20.lambdaBuiltInFunctions.Listing56;

import java.util.stream.Stream;
import java.util.Random;

class GenerateBooleans {
    public static void main(String []args) {
        Random random = new Random();
         Stream.generate(random::nextBoolean)
                  .limit(12)
                  .forEach(System.out::println);
    }
}
