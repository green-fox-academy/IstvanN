import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    sharpies = new ArrayList<>();
  }

  public List add(Sharpie sharpie) {
    sharpies.add(sharpie);
    return sharpies;
  }

  public int countAll() {
    return sharpies.size();
  }

  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie : sharpies) {
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public List removeTrash() {
    for (Sharpie sharpie : sharpies) {
      if (sharpie.inkAmount == 0) {
        sharpies.remove(sharpie);
      }
    }
    return sharpies;
  }
}
