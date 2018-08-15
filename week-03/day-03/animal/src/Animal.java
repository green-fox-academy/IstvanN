public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
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
}
