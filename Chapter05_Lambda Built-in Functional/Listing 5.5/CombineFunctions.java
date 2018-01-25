/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.function.Function;

public class CombineFunctions {
    public static void main(String []args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> absInt = Math::abs;
        Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);

        Arrays.stream("4, -9, 16".split(", "))
                .map(parseAndAbsInt)
                .forEach(System.out::println);
    }

}
