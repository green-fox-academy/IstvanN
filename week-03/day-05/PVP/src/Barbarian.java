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
    healthPoint = rollDice100() + stamina;
    baseDamage = rollDice10() + strength;
  }

  //  The Dices
  public int rollDice10() {
    int roll10 = random.nextInt(9) + 1;
    return roll10;
  }

  public int rollDice100() {
    int roll100 = random.nextInt(99) + 1;
    return roll100;
  }

  //    The skills (methods)
//    The heal
  public int warCry() {
    int heal = rollDice10() + stamina;
    healthPoint += heal;
    System.out.println(name + " used War Cry, and healed " + heal + " points. HP left: " + healthPoint);
    return healthPoint;
  }
//    The 3 damage skills
//  public int useWeapon() {
//
//  }
}
