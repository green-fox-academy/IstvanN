package com.greenfoxacademy.restexercises.models;

public class Greeter {

  private String welcomeMessage;

  public Greeter() {
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }

  public void greet(String name, String title) {
    welcomeMessage = "Oh, hi there " + name + ", my dear " + title + " student!";
  }
}
