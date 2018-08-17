public class Weapon {
  int weaponDamage;
  int selfHeal;
  int selfDamage;
  boolean enchanted;

  public Weapon(int weaponDamage, boolean enchanted, boolean cursed) {
    this.weaponDamage = weaponDamage;
    if (enchanted) {
      this.weaponDamage += 5;
      selfHeal = 5;
    }
    if (cursed) {
      this.weaponDamage += 5;
      selfDamage = 5;
    }
  }

//  public void use(Barbarian barbarian, Mage mage) {
//    barbarian.healthPoint += selfHeal;
//    barbarian.healthPoint -= selfDamage;
//    mage.healthPoint -= weaponDamage + barbarian.baseDamage;
//  }
}