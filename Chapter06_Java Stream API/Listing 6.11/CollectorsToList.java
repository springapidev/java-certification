/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.List;

public class CollectorsToList {
    public static void main(String []args) {
String frenchCounting = "un:deux:trois:quatre";
List gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
    	gmailList.forEach(System.out::println);
    }
}
