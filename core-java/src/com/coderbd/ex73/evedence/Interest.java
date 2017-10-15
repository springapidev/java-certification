package com.coderbd.ex73.evedence;
import java.util.*;
public class Interest {
    public static void main(String[] args) {
       //creating scanner to accept principle, rate and time input form user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculate interest");
     
        System.out.println("Please enter principle amount :");
        float amount = scanner.nextFloat();
     
        System.out.println("Enter time in years : ");
        float time = scanner.nextFloat();
     
        System.out.println("Enter rate annually : ");
        float rate = scanner.nextFloat();
     
        float interest = calculateInterest(amount, rate, time);
     float sudasol=amount + interest;
        System.out.println("Simple interested : " + interest+" And Sudasol "+sudasol);
    }
 
    public static float calculateInterest(float principle, float rate, float time){
        float interest = (principle*rate*time)/100;
        return interest;
    }

}
