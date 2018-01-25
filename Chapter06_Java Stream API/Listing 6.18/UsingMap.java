/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.List;

public class UsingMap {
    public static void main(String []args) {
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); 
  	integers.stream()
                .map(i -> i * i)
               .forEach(System.out::println);
    }
}
 
