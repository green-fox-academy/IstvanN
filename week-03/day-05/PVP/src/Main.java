import java.util.Random;

public class Main {

  public static void main(String[] args) {
//    Creating the characters
    MageWeapon staff = new MageWeapon("Staff of Fire", 5);
    Mage koni = new Mage("Börne", 4, 8, staff);
    Barbarian archie = new Barbarian("Konan");

  }

  public static void whichSkill(Barbarian barbarian, Mage mage) {
//    What the barbarian does
    Random random = new Random();
    int barbarianRoll = random.nextInt(2);
    if (barbarianRoll == 0) {
      barbarian.battleCry();
    } else {
      barbarian.useWeapon(barbarian, mage);
    }
//    What the mage does
    int mageRoll = random.nextInt(4);
    if (mageRoll == 0) {
      mage.eatFire(mage);
    } else if (mageRoll == 1) {
      mage.fireArrow(staff, barbarian) {
    }
  }

  public static void getStatus(Barbarian barbarian, Mage mage) {
    System.out.println(barbarian.name + " has the following stats:");
    System.out.println("Strength: " + barbarian.strength);
    System.out.println("Stamina: " + barbarian.stamina);
    System.out.println("Health Point: " + barbarian.healthPoint);
    System.out.println("Base damage: " + barbarian.baseDamage + "\n");
    System.out.println(mage.name + " has the following stats:");
    System.out.println("Intelligence: " + mage.intelligence);
    System.out.println("Stamina: " + mage.stamina);
    System.out.println("Base damage: " + mage.baseDamage);
  }
}

