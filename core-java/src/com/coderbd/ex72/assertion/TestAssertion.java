package com.coderbd.ex72.assertion;

import java.util.Scanner;

public class TestAssertion {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur age ");

        int value = scanner.nextInt();
        assert value >= 18 : " Not valid";

        System.out.println("value is " + value);
    }
}
/**
 * Compile it by: javac AssertionExample.java Run it by: java -ea
 * AssertionExample
 */

/**
 * Assertion:
 *
 * Assertion is a statement in java. It can be used to test your assumptions
 * about the program.
 *
 * While executing assertion, it is believed to be true. If it fails, JVM will
 * throw an error named AssertionError. It is mainly used for testing purpose.
 * Advantage of Assertion:
 *
 * It provides an effective way to detect and correct programming errors. Syntax
 * of using Assertion:
 *
 * There are two ways to use assertion. First way is:
 *
 * assert expression;  *
 * and second way is:
 *
 * assert expression1 : expression2;
 *
 * If you use assertion, It will not run simply because assertion is disabled by
 * default. To enable the assertion, -ea or -enableassertions switch of java
 * must be used.
 *
 *
 * Output: Enter ur age 11 Exception in thread "main" java.lang.AssertionError:
 * Not valid
 *
 * Where not to use Assertion:
 *
 * There are some situations where assertion should be avoid to use. They are:
 *
 * According to Sun Specification, assertion should not be used to check
 * arguments in the public methods because it should result in appropriate
 * runtime exception e.g. IllegalArgumentException, NullPointerException etc. Do
 * not use assertion, if you don't want any error in any situation.
 *
 */
