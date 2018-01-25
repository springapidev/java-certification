/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.*;

class Sort {
    public static void main(String []args) {
        List<String> strings = Arrays.asList("eeny ", "meeny ", "miny ", "mo ");
    	   Collections.sort(strings, (str1, str2) -> str2.compareTo(str1)); 
        strings.forEach(string -> System.out.print(string));
    }
}
