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

  public int flight() {
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
    String status = "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + damage + ", All Damage: " + maxDamage;
    return status;
  }

  public boolean isPriority() {
    return priority;
  }
}
