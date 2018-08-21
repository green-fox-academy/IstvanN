import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> aircrafts;
  int ammoStorage;
  int healthPoint;

  public Carrier(int initialAmmo, int healthPoint) {
    ammoStorage = initialAmmo;
    this.healthPoint = healthPoint;
    aircrafts = new ArrayList<>();
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public int calculateAmmoNeeded () {
    int ammoNeeded = 0;
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.currentAmmo < aircraft.maxAmmo) {
        int missingAmmo = aircraft.maxAmmo - aircraft.
      }
    }
  }
}
