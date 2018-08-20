import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship;
  String name;
  int score;
  Pirate captain;
  Random random = new Random();

  public Ship() {
    ship = new ArrayList<>();
    score = 0;
  }

  public Ship(String name) {
    this.name = name;
    ship = new ArrayList<>();
  }

  public List fillShip() {
    for (int i = 0; i <= random.nextInt(10); i++) {
      ship.add(new Pirate());
    }
    score = numberOfAliveCrew();
    return ship;
  }

  public List fillShipWithCaptain(String captainName) {
    for (int i = 0; i <= random.nextInt(10); i++) {
      ship.add(new Pirate());
    }
    ship.set(random.nextInt(ship.size()), new Pirate(captainName));
    score = numberOfAliveCrew() + getCaptain().rumLevel;
    return ship;
  }

  public Pirate getCaptain() {
    for (Pirate pirate : ship) {
      if (pirate.isCaptain) {
        captain = pirate;
        break;
      }
    }
    return captain;
  }

  public void captainStatus() {
    if (captain.alive) {
      System.out.println(captain.captainName + " has the following stats:");
      System.out.println("Rum level: " + captain.rumLevel);
      System.out.println("Passed out: " + captain.passedOut);
    } else {
      System.out.println("The captain is dead. RUN!!!!");
    }
  }

  public int letTheCaptainDrink() {
    getCaptain().rumLevel++;
    score = getCaptain().rumLevel + numberOfAliveCrew();
    return captain.rumLevel;
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
