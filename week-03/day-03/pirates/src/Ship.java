import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship;
  String name;
  int score;

  public Ship(String name) {
    this.name = name;
    ship = new ArrayList<>();
    score = numberOfAliveCrew() + captainStatus();
  }

  public List fillShip(String captainName) {
    Random random = new Random();
    for (int i = 0; i <= random.nextInt(10); i++) {
      if (i == random.nextInt(10)) {
        ship.add(new Pirate(captainName));
      } else {
        ship.add(new Pirate());
      }
    }
    return ship;
  }

  public int captainStatus() {
    int captainRumLevel = 0;
    for (Pirate pirate : ship) {
      if (pirate.isCaptain) {
        if (pirate.alive) {
          System.out.println(pirate.captainName + " has the following stats:");
          System.out.println("Rum level: " + pirate.rumLevel);
          System.out.println("Passed out: " + pirate.passedOut);
          captainRumLevel += pirate.rumLevel;
        } else {
          System.out.println("The captain is dead. RUN!!!!");
        }
      }
    }
    return captainRumLevel;
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

  public List party() {
    Random random = new Random();
    for (Pirate pirate : ship) {
      for (int i = 0; i <= random.nextInt(10); i++)
        pirate.drinkSomeRum();
    }
    return ship;
  }

  public boolean battle(Ship otherShip) {
    Random random = new Random();
    if (score > otherShip.score) {
      for (int i = 0; i <= random.nextInt(10); i++) {
        otherShip.ship.get(i).die();
      }
      party();
      return true;
    } else {
      for (int i = 0; i <= random.nextInt(10); i++) {
        ship.get(i).die();
      }
      otherShip.party();
      return false;
    }
  }
}
