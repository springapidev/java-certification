package com.coderbd.day21.LambdaOperations.ch10.Listing611;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.List;

public class CollectorsToList {
    public static void main(String []args) {
String frenchCounting = "un:deux:trois:quatre";
List gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
    	gmailList.forEach(System.out::println);
    }
}
