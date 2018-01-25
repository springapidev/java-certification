/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Optional;
import java.util.stream.Stream;

public class StringToUpper {
	public static void main(String args[]){
	    Stream.of("eeny ","meeny ",null).forEach(StringToUpper::toUpper);
	}
	private static void toUpper(String str) {
	    Optional <String> string = Optional.ofNullable(str);
         System.out.print(string.map(String::toUpperCase).orElse("dummy"));
	}
}
