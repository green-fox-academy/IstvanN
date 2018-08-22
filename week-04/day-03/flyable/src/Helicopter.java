public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String color, int numberOfWheels) {
    this.color = color;
    this.numberOfWheels = numberOfWheels;
    canFly = true;
  }

  @Override
  public void land() {
    System.out.println("Landing...");
  }

  @Override
  public void fly() {
    System.out.println("Flying...");
  }

  @Override
  public void takeOff() {
    System.out.println("Taking off...");
  }

  @Override
  void move() {
    System.out.println("Moving on my " + getNumberOfWheels() + " wheels.");
  }
}
