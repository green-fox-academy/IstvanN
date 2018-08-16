import java.util.List;

public class Farm {
  List<Animal> animals;
  int slots;

  public Farm(int slots) {
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

  public List slaughter(Animal animal) {
    animals.remove(animal);


    slots++;
    return animals;
  }
}
