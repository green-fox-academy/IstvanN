public class Main {

  public static void main(String[] args) {

    Animal dog = new Animal();
    dog.printStatus();

    for (int i = 0; i < 5; i++) {
      dog.play();
    }

    dog.printStatus();

    for (int i = 0; i < 50; i++) {
      dog.drink();
      dog.eat();
    }

    dog.printStatus();
    System.out.println(dog.animalCounter);

    Animal duck = new Animal();
    System.out.println(Animal.animalCounter);
  }
}
