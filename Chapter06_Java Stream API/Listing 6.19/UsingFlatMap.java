/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.List;

public class UsingFlatMap {
    public static void main(String []args) {
        List<List<Integer>> intsOfInts = Arrays.asList(
                                            Arrays.asList(1, 3, 5),
                                            Arrays.asList(2, 4));
        intsOfInts.stream()
                .flatMap(ints -> ints.stream())
            	.sorted()
            	.map(i -> i * i)
            	.forEach(System.out::println);
    }
}
