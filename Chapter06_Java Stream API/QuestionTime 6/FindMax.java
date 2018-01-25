/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMax {
	public static void main(String args[]) {
	    maxMarks(IntStream.of(52,60,99,80,76));		// #1
	}
	public static void maxMarks(IntStream marks) {
    	    OptionalInt max = marks.max();			// #2
		if(max.ifPresent()) { 				// #3
			System.out.print(max.getAsInt());
		}	
	}
}

