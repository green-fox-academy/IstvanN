package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is YELLOW!");
  }
}
