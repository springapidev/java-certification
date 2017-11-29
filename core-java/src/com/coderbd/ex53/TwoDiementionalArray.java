package com.coderbd.ex53;

public class TwoDiementionalArray {
    public static void main(String[] args) {
        int[][] twoDArray ={{1,2,3,4},{2,4,5,3},{4,4,5,8}, {47,88,95,100},{2,6,8,1}};

        //2D array printing
        System.out.println("====2D Array Print using For Loop====");
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }
        //Or print  using enhance for
        System.out.println("====2D Array Print using enhance For Loop====");
        for (int[] rowArray: twoDArray ) {
            for(int data: rowArray) {
                System.out.print(" "+data);
            }
            System.out.println();
        }

    }
}
