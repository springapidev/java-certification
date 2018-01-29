package com.coderbd.ex32;

/**
 * Created by J2EE-33 on 9/17/2017.
 */
public class SumUsingForLoop {
    private int startingnumber;
    private int endingNumber;
    private int result = 0;

    public int getSumResult(int s, int e){
        for(int i=s; i<=e; i++){
            result+=i;

        }
        return result;
    }

    public int getStartingnumber() {
        return startingnumber;
    }

    public int getEndingNumber() {
        return endingNumber;
    }

    public void setStartingnumber(int startingnumber) {
        this.startingnumber = startingnumber;
    }

    public void setEndingNumber(int endingNumber) {
        this.endingNumber = endingNumber;
    }
}


