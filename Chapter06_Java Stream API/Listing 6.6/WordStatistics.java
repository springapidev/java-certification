/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

public class WordStatistics {
    public static void main(String []args) {
        String limerick = "There was a young lady named Bright " +
                          "who traveled much faster than light " +
                          "She set out one day " +
                          "in a relative way " +
                          "and came back the previous night ";

        IntSummaryStatistics wordStatistics =
                Pattern.compile(" ")
                .splitAsStream(limerick)
                .mapToInt(word -> word.length())
                .summaryStatistics();

        System.out.printf(" Number of words = %d \n Sum of the length of the words = %d \n" +
                          " Minimum word size = %d \n Maximum word size %d \n " + 
                          " Average word size = %f \n", wordStatistics.getCount(),
                           wordStatistics.getSum(), wordStatistics.getMin(),
                           wordStatistics.getMax(), wordStatistics.getAverage());
    }
}
