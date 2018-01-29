package com.coderbd.ex35;

/**
 * Created by Mohammad Rajaul Islam
 */
//Class declaration
public class MyDate extends Object{
    //Instance variable declaration Or variable declaration Or Field declaration
    private int day=1;
    private int month=1;
    private int year= 2000;

    public MyDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public MyDate(MyDate date){
        this.day=date.day;
        this.month=date.month;
        this.year=date.year;
    }

    public MyDate addDays(int moreDays){
        MyDate newDate=new MyDate(this);
        newDate.day=newDate.day + moreDays;
        return newDate;
    }
//It is method of Object class and here is overrided
    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }


}
