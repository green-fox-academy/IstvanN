package com.greenfoxacademy.greenfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  String name;
  List<String> tricks;
  String food;
  String drink;

  public Fox() {
    tricks = new ArrayList<>();
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

  public void teachTrick(String trick) {
    if (!tricks.contains(trick)) {
      tricks.add(trick);
    }
  }
}
