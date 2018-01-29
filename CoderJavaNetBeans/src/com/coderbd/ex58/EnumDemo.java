/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.ex58;

import com.coderbd.ex57.*;

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
