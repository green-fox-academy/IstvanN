import java.util.ArrayList;
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

  public List slaughter() {
    List<Animal> tempList = new ArrayList<>();
    tempList.addAll(animals);
    for (int j = 0; tempList.size() != 1; j++) {
      for (int i = 0; i < tempList.size(); i++) {
        if (tempList.get(j).hunger > tempList.get(i).hunger) {
          tempList.remove(animals.get(j));
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
