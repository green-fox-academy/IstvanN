import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship;
  String name;

  public Ship(String name) {
    this.name = name;
    ship = new ArrayList<>();
  }

  public List fillShip() {
    Random random = new Random();
    for (int i = 0; i < random.nextInt(10) + 1; i++) {
      if (i == 0) {
        ship.add(new Pirate("Captain Sparrow"));
      } else {
        ship.add(new Pirate());
      }
    }
    return ship;
  }

  public void captainStatus() {
    for (Pirate pirate : ship) {
      if (pirate.isCaptain) {
        if (pirate.alive) {
          System.out.println(pirate.captainName + " has the following stats:");
          System.out.println("Rum level: " + pirate.rumLevel);
          System.out.println("Passed out: " + pirate.passedOut);
        } else {
          System.out.println("The captain is dead. RUN!!!!");
        }
      }
    }
  }

  public int numberOfAliveCrew() {
    int numberOfAlivePirates = 0;
    for (Pirate pirate : ship) {
      if (pirate.alive) {
        numberOfAlivePirates++;
      }
    }
    return numberOfAlivePirates;
  }

  public void shipStatus() {
    System.out.println(name + " is in the following condition:");
    captainStatus();
    System.out.println("The number of alive pirates are: " + numberOfAliveCrew());
  }
}
