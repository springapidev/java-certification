/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {
    public static void main(String []args) {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }
}
