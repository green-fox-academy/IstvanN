public class Aircraft {
  int currentAmmo;
  int maxAmmo;
  int damage;

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
}
