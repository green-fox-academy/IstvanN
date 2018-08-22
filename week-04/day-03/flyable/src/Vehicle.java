public abstract class Vehicle {
  int numberOfWheels;
  boolean canFly;
  String color;

  abstract void move();

  public int getNumberOfWheels() {
    return numberOfWheels;
  }
}
