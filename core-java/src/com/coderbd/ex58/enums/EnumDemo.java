package com.coderbd.ex58.enums;
/**
 *
 * @author J2EE-33
 */
public class EnumDemo {

    public static void main(String[] args) {
        Person person = new Person("urmi", 21, Gender.FEMALE);

        System.out.println("Name: " + person.getName()
                + " Age: " + person.getAge()
                + " Gender: " + person.getGender());
    }
}
