package com.coderbd.day20.lambdaBuiltInFunctions.Listing53;

import java.util.stream.Stream;
import java.util.function.Consumer; 

class ConsumerUse {   
    public static void main(String []args) {
	Stream<String> strings = Stream.of("hello", "world"); 
        Consumer<String> printString = System.out::println;	
	strings.forEach(printString);
    }
}
