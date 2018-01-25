/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.IntStream;

public class MatchUse {
    public static void main(String []args) {
	// Average temperatures in Concordia, Antarctica in a week in October 2015
        boolean anyMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);

        boolean allMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);

        boolean noneMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);

    }
}
