public class Mage {
  String name;
  int stamina;
  int intelligence;
  int healthPoint = (int) (Math.random() * 90 + 80);
  int baseDamage = (int) (Math.random() * 5);
  MageWeapon staff;

  // Mage class constructor

  Mage(String name, int stamina, int intelligence, MageWeapon staff) {
    this.name = name;
    this.stamina = stamina;
    this.intelligence = intelligence;
    healthPoint += stamina;
    this.staff = staff;
  }

  // Mage skills

  public void status() {
    System.out.println(name + "’s stamina is: " + stamina);
    System.out.println(name + "’s intelligence is: " + intelligence);
    System.out.println(name + "’s HP is currently: " + healthPoint);
  }

  public int fireBall(MageWeapon staff, Barbarian target) {
    int damage = baseDamage + (intelligence + staff.intBoost) / 10 + 2;
    System.out.println(name + " hurls a fireball at his enemies. It does" + damage + " damage.");
    target.healthPoint -= damage;
    return damage;
  }

  public int fireArrow(MageWeapon staff, Barbarian target) {
    int arrowCount = (int) (Math.random() * 4);
    int damage = baseDamage + (intelligence + staff.intBoost) / 10 + arrowCount * 2;
    System.out.println(name + " shoots " + arrowCount + " fiery arrows at his enemies. It does " + damage + " damage.");
    target.healthPoint -= damage;
    return damage;
  }

  public int fireWall(MageWeapon staff, Barbarian target) {
    int damage = baseDamage + (intelligence + staff.intBoost) / 10 + 3;
    System.out.println(name + " creates a fiery firewall between him and his enemies. It does " + damage + " damage.");
    target.healthPoint -= damage;
    return damage;
  }

  public int eatFire(Mage target) {
    System.out.println(name + " does something that would seem horrible to a non-pyromaniac person. He begins to cast fire in his left palm and shoves it into his mouth. It heals him by " + stamina + " points.");
    target.healthPoint += stamina;
    return target.healthPoint;
  }
}

