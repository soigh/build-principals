package com.test;

import org.apache.commons.collections.Predicate;
import org.apache.log4j.Logger;

class Project{

 public String getasdGreeting() {
        return "Hello, MNT Lab!";
    }
}
  public static void main(String[] args) {
    System.out.println(new Project().getGreeting());
  }
}
