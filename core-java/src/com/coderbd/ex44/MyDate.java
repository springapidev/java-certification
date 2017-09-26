package com.coderbd.ex44;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null && (o instanceof MyDate)) {
            MyDate d = (MyDate) o;
            if (day == d.day && month == d.month && year == d.year) {
                result = true;
            }
        }

        return result;
    }

}
