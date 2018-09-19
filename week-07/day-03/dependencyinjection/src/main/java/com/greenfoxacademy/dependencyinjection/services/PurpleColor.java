package com.greenfoxacademy.dependencyinjection.services;

public class PurpleColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is PURPLE!");
  }
}
