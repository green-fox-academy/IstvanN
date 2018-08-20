import jdk.management.resource.internal.inst.AbstractInterruptibleChannelRMHooks;

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

  public List shipBattle(Armada otherArmada) {
    for (int i = 0; i < armada.size(); i++) {
      for (int j = 0; j < otherArmada.size(); j++) {
        System.out.println("Ship " + (i + 1) + "(score: " + armada.get(i).score + ") vs. Ship " + (j + 1) + "(score: " + otherArmada.getShip(j).score + ")");
        if (armada.get(i).score > otherArmada.getShip(j).score) {
          otherArmada.remove(j);
        } else {
          armada.remove(i);
        }
      }
    }
    return armada;
  }

  public void war(Armada otherArmada) {
    while (true) {
      if (armada.size() == 0) {
        System.out.println("The winner of the war is: " + otherArmada.name);
        break;
      } else if (otherArmada.size() == 0) {
        System.out.println("The winner of the war is: " + name);
        break;
      }
      shipBattle(otherArmada);
    }
  }
}
