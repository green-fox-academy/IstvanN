import java.util.ArrayList;
import java.util.EmptyStackException;
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

  public int calculateAmmoNeeded() {
    int ammoNeeded = 0;
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.needAmmo()) {
        ammoNeeded += aircraft.getMissingAmmo();
      }
    }
    return ammoNeeded;
  }

  public void fillWithPriority() {
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.isPriority()) {
        ammoStorage = aircraft.refill(ammoStorage);
      }
    }
    if (ammoStorage != 0) {
      for (Aircraft aircraft : aircrafts) {
        if (!aircraft.isPriority()) {
          ammoStorage = aircraft.refill(ammoStorage);
        }
      }
    }
  }

  public void fillAll() {
    if (ammoStorage == 0) {
      throw new EmptyStackException();
    } else if (ammoStorage >= calculateAmmoNeeded()) {
      for (Aircraft aircraft : aircrafts) {
        ammoStorage = aircraft.refill(ammoStorage);
      }
    } else {
      fillWithPriority();
    }
  }

  public void fight(Carrier otherCarrier) {
    int damageOutput = 0;
    for (Aircraft aircraft : aircrafts) {
      damageOutput += aircraft.fight();
    }
    otherCarrier.healthPoint -= damageOutput;
  }

  public int calculateMaxDamage() {
    int maxDamage = 0;
    for (Aircraft aircraft : aircrafts) {
      maxDamage += aircraft.calculateDamage();
    }
    return maxDamage;
  }

  public String getStatus() {
    String status = "HP: " + healthPoint + ", Aircraft count: " + aircrafts.size() + ", Ammo storage: " + ammoStorage + ", Total damage: " + calculateMaxDamage() + "\n"
        + "Aircrafts:\n";
    if (healthPoint > 0) {
      for (Aircraft aircraft : aircrafts) {
        status += aircraft.getStatus() + "\n";
      }
    } else {
      status = "It's dead, Jim! :(";
    }
    return status;
  }
}
