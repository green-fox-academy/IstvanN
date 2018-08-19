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
}
