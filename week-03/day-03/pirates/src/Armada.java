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

  public boolean war(Armada otherArmada) {
    for (int i = 0; i < armada.size(); i++) {
      for (int j = 0; j < otherArmada.size(); j++) {
        if (armada.get(i).score > otherArmada.getShip(j).score) {
      }
    }
  }
}
