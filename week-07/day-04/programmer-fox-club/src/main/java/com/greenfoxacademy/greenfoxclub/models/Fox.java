package com.greenfoxacademy.greenfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  String name;
  int numberOfTricks;
  List<String> tricks;
  String food;
  String drink;

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    numberOfTricks = tricks.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public int getNumberOfTricks() {
    return numberOfTricks;
  }

  public void setNumberOfTricks(int numberOfTricks) {
    this.numberOfTricks = numberOfTricks;
  }
}
