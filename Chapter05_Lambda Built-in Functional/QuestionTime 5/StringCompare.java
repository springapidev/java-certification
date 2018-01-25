/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.function.BiFunction;

public class StringCompare {
	public static void main(String args[]){
		BiFunction<String, String, Boolean> compareString = (x, y) -> x.equals(y);
		System.out.println(compareString.apply("Java8","Java8")); // #1	
	}
}