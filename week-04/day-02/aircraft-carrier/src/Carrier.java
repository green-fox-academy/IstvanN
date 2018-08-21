import java.util.List;

public class Carrier {
  List<Aircraft> aircrafts;
  int maxAmmo;
  int currentAmmo;
  int healthPoint;

  public Carrier(int initialAmmo, int healthPoint) {
    currentAmmo = initialAmmo;
    this.healthPoint = healthPoint;
  }
}
