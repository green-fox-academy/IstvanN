package main.java;

public class Reptile extends Animal {

  public Reptile() {
    name = "Random reptile";
    age = 0;
    gender = "female";
    numberOfLegs = 4;
    hasWings = false;
  }

  @Override
  public void move() {
    System.out.println("Moving on " + getNumberOfLegs() + " legs.");
  }

  @Override
  public void makeASound() {
    if (getGender().equals("male")) {
      System.out.println("Wrooooooooaa");
    } else {
      System.out.println("Wreeeeeeee");
    }
  }
}
