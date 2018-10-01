package com.greenfoxacademy.restexercises.models.frontend;

public class Doubling {

  private Integer received;
  private Integer result;

  public Doubling() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void doubleRecieved() {
    result = received * 2;
  }
}
