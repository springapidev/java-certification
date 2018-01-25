/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MatchUse {
    public static void main(String []args) {
        IntStream temperatures = IntStream.of(-5, -6, -7, -5, 2, -8, -9);
        IntPredicate positiveTemperature = temp -> temp > 0;   // #1

        if(temperatures.anyMatch(positiveTemperature)) {       // #2     
             int temp = temperatures
                              .filter(positiveTemperature)
                              .findAny()
                              .getAsInt();			  // #3	
		System.out.println(temp); 
        }
    }
}
