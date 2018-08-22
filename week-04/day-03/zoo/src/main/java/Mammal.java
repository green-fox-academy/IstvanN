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
}
