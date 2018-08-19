import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship;
  String name;
  int score;
  Pirate captain;

  public Ship(String name) {
    this.name = name;
    ship = new ArrayList<>();

  }

  public List fillShip(String captainName) {
    Random random = new Random();
    for (int i = 0; i <= random.nextInt(10); i++) {
      ship.add(new Pirate());
    }
    ship.set(random.nextInt(ship.size()), new Pirate(captainName));
    score = numberOfAliveCrew() + captainRumLevel();
    return ship;
  }

  public Pirate getCaptain() {
    for (Pirate pirate : ship) {
      if (pirate.isCaptain) {
        captain = pirate;
      }
    }
    return captain;
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

  public int captainRumLevel() {
    int captainRum = 0;
    for (Pirate pirate : ship) {
      if (pirate.isCaptain) {
        captainRum += pirate.rumLevel;
      }
    }
    return captainRum;
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
    System.out.println("Score: " + score + "\n");
  }

  public List party() {
    Random random = new Random();
    for (Pirate pirate : ship) {
      for (int i = 0; i <= random.nextInt(10); i++)
        pirate.drinkSomeRum();
    }
    return ship;
  }

  public int size() {
    return ship.size();
  }

  public boolean battle(Ship otherShip) {
    Random random = new Random();
    if (score >= otherShip.score) {  // equal is also enough to win, because they attack first
      for (int i = 0; i <= random.nextInt(otherShip.size()); i++) {
        otherShip.ship.get(i).die();
      }
      System.out.println("The winner is: " + name);
      party();
      return true;
    } else {
      for (int i = 0; i <= random.nextInt(ship.size()); i++) {
        ship.get(i).die();
      }
      System.out.println("The winner is: " + otherShip.name);
      otherShip.party();
      return false;
    }
  }
}
