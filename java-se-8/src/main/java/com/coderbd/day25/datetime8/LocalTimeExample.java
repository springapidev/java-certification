package com.coderbd.day25.datetime8;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;
import static java.lang.System.out;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;
        now = LocalTime.now();
        out.println("The time now is: " + now);
        nowPlus = now.plusHours(1).plusMinutes(15);
        out.println("What time is it 1 hour 15 minutes from now? " + nowPlus);
        nowHrsMins = now.truncatedTo(MINUTES);
        out.println("Truncate the current time to minutes: " + nowHrsMins);
        out.println("It is the " + now.toSecondOfDay() / 60 + "th minute");
        lunch = LocalTime.of(12, 30);
        out.println("Is lunch in my future? " + lunch.isAfter(now));
        long minsToLunch = now.until(lunch, MINUTES);
        out.println("Minutes til lunch: " + minsToLunch);
        bedtime = LocalTime.of(21, 0);
        long hrsToBedtime = now.until(bedtime, HOURS);
        out.println("How many hours until bedtime? " + hrsToBedtime);
    }
}
