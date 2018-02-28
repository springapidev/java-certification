package com.coderbd.day25.datetime3;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;

public class TimeDifference {
    public static void main(String[] args) {
        ZoneId singaporeZone = ZoneId.of("Asia/Singapore");
        ZonedDateTime dateTimeInSingapore = ZonedDateTime.of(
        LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0), singaporeZone);

        ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
        ZonedDateTime sameDateTimeInAuckland =
                    dateTimeInSingapore.withZoneSameInstant(aucklandZone);

        Duration timeDifference = Duration.between(
                                dateTimeInSingapore.toLocalTime(),
                                sameDateTimeInAuckland.toLocalTime());

        System.out.printf("Time difference between %s and %s zones is %d hours\n",
                    singaporeZone, aucklandZone, timeDifference.toHours());
    }
}
