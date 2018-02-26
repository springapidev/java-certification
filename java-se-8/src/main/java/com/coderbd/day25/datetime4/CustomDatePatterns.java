package com.coderbd.day25.datetime4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDatePatterns {
    public static void main(String []args) {
        // patterns from simple to complex ones
        String [] dateTimeFormats = {
                "dd-MM-yyyy", /* d is day (in month), M is month, y is year */
                "d '('E')' MMM, YYYY", /*E is name of the day (in week), Y is year*/
                "w'th week of' YYYY", /* w is the week of the year */
                "EEEE, dd'th' MMMM, YYYY" /*E is day name in the week */
        };
            LocalDateTime now = LocalDateTime.now();
            for(String dateTimeFormat : dateTimeFormats) {
                System.out.printf("Pattern \"%s\" is %s %n", dateTimeFormat,
                        DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
            }
    }
}
