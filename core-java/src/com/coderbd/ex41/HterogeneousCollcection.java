package com.coderbd.ex41;

/**
 * Created by Mohammad Rajaul Islam
 */
public class HterogeneousCollcection {
    public static void main(String[] args) {

        //Homogeneous Data
        int[] x={2,8,5,6,7,4,7,6};

        //HterogeneousCollcection
        Employee[] staff=new Employee[1024];
        staff[0]=new Manager();
        staff[1]=new Employee();
        staff[2]=new Engineer();
    }
}
