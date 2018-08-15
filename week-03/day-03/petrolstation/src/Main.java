public class Main {
  public static void main(String[] args) {
    Car trabant = new Car();
    Station petrolStation = new Station();
    getStatus(petrolStation, trabant);
    petrolStation.refill(trabant);
    getStatus(petrolStation, trabant);

    Car opel = new Car();
    petrolStation.refill(opel);
    getStatus(petrolStation, opel);

  }

  public static void getStatus(Station station, Car car) {
    System.out.println("The Station's remaining fuel: " + station.gasAmount);
    System.out.println("The car's fuel: " + car.gasAmount);
  }
}
