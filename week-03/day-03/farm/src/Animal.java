public class Animal {

  int hunger;
  int thirst;


  public Animal() {
    hunger = 5;
    thirst = 5;

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
  }
}
