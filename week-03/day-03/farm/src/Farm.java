import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

  public Animal breed(String animalName) {
    if (slots > 0) {
      animals.add(new Animal(animalName));
      slots--;
    } else {
      System.out.println("Sorry, this farm is full!");
    }
    return new Animal(animalName);
  }

  public int farmSize() {
    return animals.size();
  }

  public void showFarm() {
    for (Animal animal : animals) {
      System.out.print(animal.name + ", ");
    }
  }

  public List slaughter() {
    int indexOfHungriest = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).hunger < animals.get(indexOfHungriest).hunger) {
        indexOfHungriest = i;
      }
    }
    animals.remove(animals.get(indexOfHungriest));
    return animals;
  }
}
