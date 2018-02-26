package com.coderbd.day25.datetime2;

import java.time.temporal.ChronoUnit;

public class ChronoUnitValues {
    public static void main(String []args) {
        System.out.println("ChronoUnit DateBased TimeBased Duration");
        System.out.println("---------------------------------------");
        for(ChronoUnit unit : ChronoUnit.values()) {
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
                        unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());
        }
    }
}
//https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html