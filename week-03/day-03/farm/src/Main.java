import java.util.List;

public class Main {

  public static void main(String[] args) {
    Farm mcdonald = new Farm(20);
    Animal pig = new Animal();
    mcdonald.addAnimal(pig);
    Animal sheep = new Animal();
    mcdonald.addAnimal(sheep);
    Animal chicken = new Animal();
    mcdonald.addAnimal(chicken);
    mcdonald.breed(chicken);
    getStatus(mcdonald);
    pig.eat();
    mcdonald.slaughter();
    getStatus(mcdonald);

  }

  public static List getStatus (Farm farm) {
    System.out.println("Number of animals in the farm: " + farm.farmSize());
    System.out.println("Remaining slots :" + farm.slots);
    System.out.println("Currently the animals in the farm are: " + farm.showFarm());
    return farm.animals;
  }
}
