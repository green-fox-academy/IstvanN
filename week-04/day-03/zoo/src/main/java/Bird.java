package main.java;

public class Bird extends Animal {

  public Bird() {
    name = "Random bird";
    age = 0;
    gender = "female";
    numberOfLegs = 2;
    hasWings = true;
  }

  public Bird(String whatever) {
    String IThinkTheExerciseHasAFault = whatever;
    name = "Bird";
    age = 0;
    gender = "female";
    numberOfLegs = 2;
    hasWings = true;
  }

  @Override
  public void move() {
    if (hasWings) {
      System.out.println("FLapping my wings.");
    } else {
      System.out.println("Moving on my " + getNumberOfLegs() + " legs.");
    }
  }

  @Override
  public void makeASound() {
    if (getGender().equals("male")) {
      System.out.println("Scroooooooch");
    } else {
      System.out.println("Screeeeeeeech");
    }
  }

}
