import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> ship;
  String name;

  public Ship(String name) {
    this.name = name;
    ship = new ArrayList<>();
  }
}
