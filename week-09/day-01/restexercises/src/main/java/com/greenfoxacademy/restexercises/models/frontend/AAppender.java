package com.greenfoxacademy.restexercises.models.frontend;

public class AAppender {

  private String appended;

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public void appendA(String wordToBeAppended) {
    appended = wordToBeAppended + "a";
  }
}
