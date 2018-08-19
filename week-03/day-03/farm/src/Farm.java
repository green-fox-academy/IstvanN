import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
  List<Animal> animals;
  String name;
  int slots;

  public Farm(String name, int slots) {
    this.name = name;
    animals = new ArrayList<>();
    this.slots = slots;
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
    slots--;
  }

  public Farm breed(Farm farm, String animalName) {
    if (slots > 0) {
      farm.addAnimal(new Animal(animalName));
    } else {
      System.out.println("Sorry, " + farm.name + " is full!");
    }

    return farm;
  }

  public int farmSize() {
    return animals.size();
  }

  public void showFarm() {
    for (Animal animal : animals) {
      System.out.print(animal + " ");
    }
  }

//  public List slaughter() {
//    List<Animal> tempList = new ArrayList<>();
//    tempList.addAll(animals);
//    while (tempList.size() != 1) {
//      for (int i = 0; i < tempList.size(); i++) {
//        if (tempList.get(i).hunger > tempList.get(i + 1).hunger) {
//          tempList.remove(animals.get(i));
//        }
//      }
//    }
//    for (Animal animal : animals) {
//      if (animal.equals(tempList.get(0))) {
//        animals.remove(animal);
//      }
//    }
//    slots++;
//    return animals;
//  }
}
