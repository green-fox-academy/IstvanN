import java.util.Random;

public class Barbarian {
  Random random = new Random();
//  Attributes
  String name;
  int strength;
  int stamina;
  int healthPoint;
//  The obstructor
  public Barbarian(String name) {
    this.name = name;
    strength = random.nextInt(9) + 1;
    stamina = random.nextInt(9) + 1;
    healthPoint = stamina + random.nextInt(99) + 1;
  }
//  The skills (methods)
//  The heal
  public int warCry() {
    int heal = random.nextInt(9) + 1;
    healthPoint += heal;
    System.out.println(name + " has just used War Cry, and healed " + heal + " points.");
    return healthPoint;
  }
//  The 3 damage skills
}
