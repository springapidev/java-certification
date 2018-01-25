/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SumUse {
    public static void main(String []args) {
        Stream<String> words = Pattern.compile(" ").splitAsStream("a bb ccc");
        System.out.println(words.map(word -> word.length()).sum());
    }
}
