package com.coderbd.ex11.arrays;

public class ArrayPrint {
    public static void main(String[] args){
        new ArrayPrint().printArray(createArray());
    }
    public static int[] createArray(){
        int[] ints=new int[2];
        ints[0]=4;
        ints[1]=5;

        return ints;
    }

    public void printArray(int[] list){
        for (int e : list){
            System.out.println("-> "+e);
        }
    }
}
