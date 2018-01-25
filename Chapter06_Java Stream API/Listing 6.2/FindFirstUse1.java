/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstUse1 {
    public static void main(String []args) {
        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Arrays.stream(methods)
                .map(method -> method.getName())
                .filter(name -> name.endsWith("Match"))
		.sorted()
                .findFirst();
        System.out.println("Result: " + methodName.orElse("No suitable method found"));
    }
} 
