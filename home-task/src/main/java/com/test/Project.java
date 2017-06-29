package com.test;

import org.apache.commons.collections.Predicate;
import org.apache.log4j.Logger;

class Project {

 public String getGreeting() {
        return "Hello, MNT Lab!";
    }

  public static void test() {
    System.out.println("test");
  }

  public static void main(String[] args) {
    System.out.println(new Project().getGreeting());
  }
 public static void switchCasePrimer() {
    	int caseIndex = 0;
    	switch (caseIndex) {
        	case 0:
            	System.out.println("Zero");
        	case 1:
            	System.out.println("One");
            	break;
        	case 2:
            	System.out.println("Two");
            	break;
        	default:
            	System.out.println("Default");
    	}
 }
}
