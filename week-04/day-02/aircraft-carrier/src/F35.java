public class F35 extends Aircraft {

  public F35() {
    maxAmmo = 12;
    damage = 50;
    type = "F35";
    priority = true;
    maxDamage = damage * maxAmmo;
  }
}
