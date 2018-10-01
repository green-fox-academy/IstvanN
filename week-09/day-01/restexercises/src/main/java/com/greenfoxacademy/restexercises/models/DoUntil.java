package com.greenfoxacademy.restexercises.models;

public class DoUntil {

  private int until;
  private int result;

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum() {
    result = summaria(until);
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
      return n = n + factorio(n - 1);
    }

    return 1;
  }
}
