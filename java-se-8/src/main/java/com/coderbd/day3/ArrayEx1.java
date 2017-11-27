package com.coderbd.day3;
/**
 *
 *  @author Mohamamd Rajaul Islam
* @version 1.0.0
* @since   22-11-2017
 */
public class ArrayEx1 {

    public static void main(String[] args) {
        //Array Index starts from 0 (zero)
        String[] items = {"Shirt", "Pants", "Scarf"};
        //print array length
        System.out.println("items: " + items.length);

        //print array Item of specific index
        System.out.println("items of index 0: " + items[0]);
        System.out.println("items  of index 1: " + items[1]);
        System.out.println("items  of index 2: " + items[2]);
        //Way - 1 to print items array using for in/for each loop
        for(String item : items){
            System.out.println("Items: "+item);
        }
         //Way - 2 to print items array using for loop
        //initizaliazation; condition; increment/decrement
        for(int i=0; i < items.length; i++ ){
            System.out.println("Items of For Loop: "+items[i]);
        }
        
        //Array index out of bound exception
       //  System.out.println("items of index 0: " + items[3]);
       
       //array
        int[] arr=new int[5];
        arr[0]=55;
        arr[2]=65;
        arr[4]=75;
        for(int num : arr){
            System.out.println("Array Print: "+num);
        }
    }
}
