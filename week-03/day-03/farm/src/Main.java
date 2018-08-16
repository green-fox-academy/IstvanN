import java.util.List;

public class Main {

  public static void main(String[] args) {
    Farm mcdonald = new Farm(20);
    Animal pig = new Animal();
    mcdonald.addAnimal(pig);
    getStatus(mcdonald);
  }

  public static List getStatus (Farm farm) {
    System.out.println("Number of animals in the farm: " + farm.farmSize());
    System.out.println("Remaining slots :" + farm.slots);
    System.out.println("Currently the animals in the farm are: " + farm.animals);
    return farm.animals;
  }
}
