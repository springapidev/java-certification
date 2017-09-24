package com.coderbd.ex40;

/**
 * Created by J2EE-33 on 9/24/2017.
 */
public class SubOrClieldClas extends SuperOrParentClass{
    private int age=10;

    public SubOrClieldClas() {
    }

    public SubOrClieldClas(int age) {
        this.age = age;
    }

    public SubOrClieldClas(String name, int age) {
        super(name);
        this.age = age;
    }

    public static void main(String[] args) {
        SubOrClieldClas obj=new SubOrClieldClas();


        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
