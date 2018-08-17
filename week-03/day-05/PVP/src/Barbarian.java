import java.util.Random;

public class Barbarian {
  Random random = new Random();
  //  Attributes
  String name;
  int strength;
  int stamina;
  int healthPoint;
  int baseDamage;

  //  The obstructor
  public Barbarian(String name) {
    this.name = name;
    strength = rollDice10();
    stamina = rollDice10();
    healthPoint = rollHP() + stamina;
    baseDamage = rollDice10() + strength;
  }

  //  The Dices
  public int rollDice10() {
    int roll10 = random.nextInt(9) + 1;
    return roll10;
  }

  public int rollHP() {
    int roll100 = random.nextInt(51) + 50;
    return roll100;
  }

  //    The skills (methods)
//    The heal
  public int battleCry() {
    int heal = rollDice10() + stamina;
    healthPoint += heal;
    System.out.println(name + " used Battle Cry, and healed " + heal + " points. HP left: " + healthPoint);
    return healthPoint;
  }

  //    The weapons
  Weapon sword = new Weapon(5, true, false);
  Weapon axe = new Weapon(5, false, true);
  Weapon hammer = new Weapon(10, true, true);

  public void useWeapon(Barbarian barbarian, Mage mage) {
    int whichWeapon = random.nextInt(3) + 1;
    if (whichWeapon == 1) {
      barbarian.healthPoint += sword.selfHeal;
      barbarian.healthPoint -= sword.selfDamage;
      mage.healthPoint -= sword.weaponDamage + barbarian.baseDamage;
      System.out.println(barbarian.name + " used his Enchanted Sword, and caused " + sword.weaponDamage + barbarian.baseDamage + " damage!");
    } else if (whichWeapon == 2) {
      barbarian.healthPoint += axe.selfHeal;
      barbarian.healthPoint -= axe.selfDamage;
      mage.healthPoint -= axe.weaponDamage + barbarian.baseDamage;
      System.out.println(barbarian.name + " used his Cursed Axe, and caused " + axe.weaponDamage + barbarian.baseDamage + " damage!");
    } else {
      barbarian.healthPoint += hammer.selfHeal;
      barbarian.healthPoint -= hammer.selfDamage;
      mage.healthPoint -= hammer.weaponDamage + barbarian.baseDamage;
      System.out.println(barbarian.name + " used his Hammer of Absolute Destruction, and caused " + hammer.weaponDamage + barbarian.baseDamage + " damage!");
    }
  }
}
