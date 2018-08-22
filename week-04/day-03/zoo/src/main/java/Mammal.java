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
    System.out.println("Moving on " + getNumberOfLegs() + "legs.");
  }

  @Override
  public void makeASound() {
    if (getGender().equals("male")) {
      System.out.println("Moaaaww");
    } else {
      System.out.println("Meeeeeee");
    }
  }
}
