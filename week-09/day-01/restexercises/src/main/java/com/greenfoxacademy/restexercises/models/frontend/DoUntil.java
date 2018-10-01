package com.greenfoxacademy.restexercises.models.frontend;

public class DoUntil {

  private int result;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(Until until) {
    result = summaria(until.getUntil());
  }

  public void fact(Until until) {
    result = factorio(until.getUntil());
  }

  private int summaria(int n) {
    if (n > 0) {
      n = n + summaria(n - 1);
    } else {
      n = 0;
    }

    return n;
  }

  private int factorio(int n) {
    if (n > 0) {
      return n = n * factorio(n - 1);
    } else {
      n = 1;
    }

    return n;
  }
}
