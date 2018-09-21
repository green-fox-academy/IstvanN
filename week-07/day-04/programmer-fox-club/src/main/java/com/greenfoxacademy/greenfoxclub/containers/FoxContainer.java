package com.greenfoxacademy.greenfoxclub.containers;

import com.greenfoxacademy.greenfoxclub.models.Fox;

import java.util.ArrayList;
import java.util.List;

public class FoxContainer {

  List<Fox> foxes;

  public FoxContainer() {
    foxes = new ArrayList<>();
  }

  public void addFox(Fox fox) {
    foxes.add(fox);
  }

  public Fox getFoxByName(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }

    return null;
  }
}
