package com.test;

import org.apache.commons.collections.Predicate;
import org.apache.log4j.Logger;

/**
 * @deprecated  As of release 1.3, replaced by {@link #Fee}
 */@Deprecated
class Fum { 
  public void myMethod() {
    Foo foo = new Foo();  // okay; the class isn't deprecated
    foo.doTheThing();  // Noncompliant
  }
}

class Bar extends Fum {  // Noncompliant; Fum is deprecated

  public void myMethod() {
    Foo foo = new Foo();  // okay; the class isn't deprecated
    foo.doTheThing();  // Noncompliant
  }
}

class Project {

 public String getGreeting() {
        return "Hello, MNT Lab!";
        int a = 1;
        while(true)
        {
          a++;
        }
    }

  public static void test() {
    System.out.println("test");
  }

  public static void main(String[] args) {
    System.out.println(new Project().getGreeting());
  }
}
