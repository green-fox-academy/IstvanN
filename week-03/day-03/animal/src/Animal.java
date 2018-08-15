public class Animal {

  int hunger;
  int thirst;
  static int animalCounter = 0;

  public Animal() {
    hunger = 50;
    thirst = 50;
    animalCounter++;
  }

  public int eat() {
    hunger -= 1;
    return hunger;
  }

  public int drink() {
    thirst -= 1;
    return thirst;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  public void printStatus() {
    System.out.println("This animal has " + hunger + " hunger and has " + thirst + " thirst.");
    System.out.println("You have been breeding animals " + animalCounter + " times.");
  }
}
