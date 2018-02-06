package com.coderbd.day21.LambdaOperations.ch10.Listing613;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {
    public static void main(String []args) {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }
}
