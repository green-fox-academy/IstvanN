package com.greenfoxacademy.restexercises.models;

public class Doubling {

  private Integer recieved;
  private Integer result;

  public Doubling() {
  }

  public int getRecieved() {
    return recieved;
  }

  public void setRecieved(int recieved) {
    this.recieved = recieved;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void doubleRecieved() {
    result = recieved * 2;
  }
}
