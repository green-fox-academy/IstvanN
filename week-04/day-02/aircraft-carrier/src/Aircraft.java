public class Aircraft {
  int currentAmmo;
  int maxAmmo;
  int damage;
  int maxDamage;
  String type;
  boolean priority;

  public Aircraft() {
    currentAmmo = 0;
  }

  public int fight() {
    int damageDone = currentAmmo * damage;
    currentAmmo = 0;
    return damageDone;
  }

  public int refill(int ammoToBeAdded) {
    int remainingAmmo;
    if (ammoToBeAdded < maxAmmo) {
      currentAmmo += ammoToBeAdded;
      remainingAmmo = 0;
    } else {
      currentAmmo = maxAmmo;
      remainingAmmo = ammoToBeAdded - maxAmmo;
    }
    return remainingAmmo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    String status = "Type " + getType() + ", Ammo: " + currentAmmo + ", Base Damage: " + damage + ", All Damage: " + maxDamage;
    return status;
  }

  public boolean isPriority() {
    return priority;
  }

  public int getMissingAmmo() {
    int missingAmmo = maxAmmo - currentAmmo;
    return missingAmmo;
  }

  public boolean needAmmo() {
    if (currentAmmo < maxAmmo) {
      return true;
    } else {
      return false;
    }
  }

  public int calculateDamage() {
    int damageDone = currentAmmo * damage;
    return damageDone;
  }
}
