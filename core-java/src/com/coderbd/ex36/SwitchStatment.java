package com.coderbd.ex36;

/**
 * Created by J2EE-33 on 9/23/2017.
 */
public class SwitchStatment {
    private static int x=2;

    public static int add(int value){
             x+=value;
             return x;
    }

    public static int substruct(int value){
        x-=value;
        return x;
    }

    public static void main(String[] args) {
        switch (x){

            case 1:
                System.out.println( "x: "+x);
                System.out.println("After add 11: "+ add(11));
                System.out.println("After minus 6: "+substruct(6));
                break;
            case 2:
                System.out.println( "x: "+x);
                System.out.println("After add 15: "+ add(15));
                System.out.println("After minus 3: "+substruct(3));
                break;
            default:
                System.out.println("No Matching");
        }
        char a='a';
        switch (a){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
break;
           default:
                System.out.println("No Matching");
        }


        String c="c";
        switch (c){
            case "a":
                System.out.println("A");
                break;
            case "c":
                System.out.println("C");
                break;
            default:
                System.out.println("No Matching");
        }


    }


}
