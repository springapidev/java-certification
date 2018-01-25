/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionStrings {
    public static void main(String []args) {
        String []string= "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();
        Map<Boolean, List<String>> wordBlocks =
                distinctWords.collect(Collectors.partitioningBy(str -> str.length() > 4));

        System.out.println("Short words (len <= 4): " + wordBlocks.get(false));
        System.out.println("Long words (len > 4): " + wordBlocks.get(true));
    }
}
