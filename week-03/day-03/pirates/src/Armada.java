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
      armada.add(new Ship());
    }
  }
}
