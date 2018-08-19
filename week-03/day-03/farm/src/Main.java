public class Main {

  public static void main(String[] args) {
    Farm farm = new Farm("McDonald", 5);

    Animal sheep = farm.breed();
    Animal lamb = farm.breed();
    Animal chicken = farm.breed();
    getStatus(farm);
    sheep.play();
    chicken.play();
    sheep.printStatus();
    chicken.printStatus();
    lamb.printStatus();
    farm.slaughter();
    getStatus(farm);
  }

  public static Farm getStatus(Farm farm) {
    System.out.println("Number of animals in the farm: " + farm.farmSize());
    System.out.println("Remaining slots: " + farm.slots);
    return farm;
  }
}
