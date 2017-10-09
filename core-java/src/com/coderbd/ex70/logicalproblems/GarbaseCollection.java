package com.coderbd.ex70.logicalproblems;

/**
 *
 * @author J2EE-33
 */
public class GarbaseCollection {
private Demo d;
 void start() {
 d = new Demo();
 this.takeDemo(d);
 }

 void takeDemo(Demo demo) {
 demo = null;
 demo = new Demo();
 }
 }
