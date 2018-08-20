import java.util.ArrayList;
import java.util.List;

public class Armada {
  String name;
  List<Ship> armada;

  public Armada(String name) {
    this.name = name;
    armada = new ArrayList<>();
  }
}
