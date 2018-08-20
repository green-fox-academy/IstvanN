import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
  String name;
  List<Ship> armada;
  Random random = new Random();

  public Armada(String name) {
    this.name = name;
    armada = new ArrayList<>();
  }

  public List fillArmada() {
    for (int i = 0; i < random.nextInt(10); i++) {
      Ship tempShip = new Ship();
      tempShip.fillShip();
      armada.add(tempShip);
    }
    return armada;
  }

  public Ship getShip(int index) {
    return armada.get(index);
  }

  public int size() {
    return armada.size();
  }

  public List remove(int index) {
    armada.remove(index);
    return armada;
  }

  public boolean war(Armada otherArmada) {
    while (armada.size() != 0 && otherArmada.size() != 0) {
      System.out.println(name + " Ship (score: " + armada.get(0).score + ") vs. " + otherArmada.name + " Ship (score: " + otherArmada.getShip(0).score + ")");
      if (armada.get(0).score >= otherArmada.getShip(0).score) {  // equal is enough since the armada ship hits first
        otherArmada.remove(0);
      } else {
        armada.remove(0);
      }
    }
    if (armada.size() == 0) {
      System.out.println("The winner is: " + otherArmada.name);
      return false;
    } else {
      System.out.println("The winner is " + name);
      return true;
    }
  }
}
