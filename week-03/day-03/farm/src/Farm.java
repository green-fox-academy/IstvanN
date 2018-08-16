import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
  List<Animal> animals;
  int slots;

  public Farm(int slots) {
    animals = new ArrayList<>();
    this.slots = slots;
  }

  public List addAnimal(Animal animal) {
    animals.add(animal);
    slots--;
    return animals;
  }

  public List breed(Animal animal) {
    animal = new Animal();
    animals.add(animal);
    slots--;
    return animals;
  }

  public int farmSize() {
    return animals.size();
  }

  public String showFarm() {
    return Arrays.toString(animals.toArray());
  }

  public List slaughter() {
    List<Animal> tempList = new ArrayList<>();
    tempList.addAll(animals);
    while (tempList.size() != 1) {
      for (int i = 0; i < tempList.size(); i++) {
        if (tempList.get(i).hunger > tempList.get(i + 1).hunger) {
          tempList.remove(animals.get(i));
        }
      }
    }
    for (Animal animal : animals) {
      if (animal.equals(tempList.get(0))) {
        animals.remove(animal);
      }
    }
    slots++;
    return animals;
  }
}
