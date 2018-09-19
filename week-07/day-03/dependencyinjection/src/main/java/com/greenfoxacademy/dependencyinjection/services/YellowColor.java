package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;


public class YellowColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is YELLOW!");
  }
}
