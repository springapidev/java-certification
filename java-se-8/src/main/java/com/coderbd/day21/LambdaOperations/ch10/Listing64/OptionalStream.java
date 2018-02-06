package com.coderbd.day21.LambdaOperations.ch10.Listing64;
import java.util.Optional;

public class OptionalStream {
    public static void main(String []args) {
Optional<String> string = Optional.of("  abracadabra  ");
    	string.map(String::trim).ifPresent(System.out::println);
    }
}
