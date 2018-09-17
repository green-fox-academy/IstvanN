package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  private long id;
  private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return String.format("%d - Greeting: %s", id, content);
  }
}
