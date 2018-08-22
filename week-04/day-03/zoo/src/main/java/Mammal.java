package main.java;

public class Mammal extends Animal {

  public Mammal() {
    name = "Random mammal";
    age = 0;
    gender = "female";
    numberOfLegs = 4;
    hasWings = false;
  }
  public Mammal(String name) {
    this.name = name;
    age = 0;
    gender = "female";
    numberOfLegs = 4;
    hasWings = false;
  }


  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  @Override
  public void move() {
    System.out.println("Moving on " + numberOfLegs + "legs.");
  }

  @Override
  public void makeASound() {
    System.out.println("Moaning");
  }
}
