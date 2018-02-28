package com.coderbd.day25.datetime11.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Rajaul Islam
 */
public class DateUtils {

    static String dateInString = "7-Jun-2013";
    static String timeInString = "22:20";

    public static void main(String[] args) {
        System.out.println("StringToDate: " + convertStringToDate(dateInString));
        System.out.println("DateToString: " + convertDateToString(convertStringToDate(dateInString)));

        System.out.println("Time as String: " + convertTimeToString(convertStringToTime(timeInString)));
        System.out.println("String to Time: " + convertStringToTime(timeInString));
    }

    public static Date convertStringToDate(String dateString) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String convertDateToString(Date date) {
        String dateAsString;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        return formatter.format(date);
    }
//for time conversion

    public static Date convertStringToTime(String timeString) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        try {
            date = formatter.parse(timeString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String convertTimeToString(Date time) {
        String timeAsString;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        return formatter.format(time);
    }

    public static void runAThread(Date stime, Date eTime) {

    }

}
