/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;

public class FunctionUse {
    public static void main(String []args) {
   	Arrays.stream("4, -9, 16".split(", "))
		.map(Integer::parseInt)
             	.map(i -> (i < 0) ? -i : i)
             	.forEach(System.out::println);
    }
}
