import java.util.List;

public class Main {

  public static void main(String[] args) {
    Farm farm = new Farm("McDonald", 5);

    Animal sheep = farm.breed("sheep");
    Animal lamb = farm.breed("Lamb");
    getStatus(farm);
  }

  public static Farm getStatus(Farm farm) {
    System.out.println("Number of animals in the farm: " + farm.farmSize());
    System.out.println("Remaining slots: " + farm.slots);
    System.out.println("Currently the animals in the farm are: ");
    farm.showFarm();
    return farm;
  }
}
