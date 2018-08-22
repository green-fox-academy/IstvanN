package main.java.animals;

public abstract class Animal {
  String name;
  int age;
  String gender;
  int numberOfLegs;
  boolean hasWings;

  public String getName() {
    return name;
  }

  public String breed() {
    return "laying eggs.";
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  public String getGender() {
    return gender;
  }

  public abstract void move();

  public abstract void makeASound();
}
