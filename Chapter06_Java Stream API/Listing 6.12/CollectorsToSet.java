/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSet {
    public static void main(String []args) {
        String []roseQuote = "a rose is a rose is a rose".split(" ");
        Set words = Arrays.stream(roseQuote).collect(Collectors.toSet());
        words.forEach(System.out::println);
    }
}
