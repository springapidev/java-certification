package com.coderbd.ex43;

/**
 * Created by J2EE-33 on 9/26/2017.
 */
public class App {

    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal dog=new Dog();
        Animal tommy=new Tommy();

        Dog dog2=new Dog();
        Dog tommy2=new Tommy();

        Tommy tommy3=new Tommy();

       //Precedence  Animal, Dog, Tommy
        Animal a0=animal;
        Animal a1=dog;
        Animal a2=tommy;
//
        Dog d1=tommy3;
        Dog d2=(Dog) animal;

//Casting on Primitives
        int x=10;//Samll
        long y=x;//Big

        int z=(int)y; //when Small from Big, then need casting

//Casting Object Reference

        Dog kutta=new Dog();
        Animal prani=kutta;

        Dog kokor=(Dog) animal;


         }


}
