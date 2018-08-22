package main.java;

public abstract class Animal {
  String name;
  int age;
  String gender;
  int numberOfLegs;
  boolean hasWings;

  public String getName() {
    return name;
  }

  public abstract String breed();

  public abstract void move();

  public abstract void makeASound();
}
