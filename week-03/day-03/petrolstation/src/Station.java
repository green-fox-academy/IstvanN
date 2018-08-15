public class Station {
  int gasAmount;

  public Station() {
    gasAmount = 500;
  }

  public int refill(Car car) {
    gasAmount -= car.capacity;
    car.gasAmount = car.capacity;
    return gasAmount;
  }
}
