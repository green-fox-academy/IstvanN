import java.util.Random;

public class Main {

  public static void main(String[] args) {
//    Creating the characters
    MageWeapon staff = new MageWeapon("Staff of Fire", 5);
    Mage koni = new Mage("Börne", 4, 8, staff);
    Barbarian archie = new Barbarian("Konan");
    getStatus(archie, koni);
    whichSkill(archie, koni, staff);
    getHP(archie, koni);

  }

  public static void whichSkill(Barbarian barbarian, Mage mage, MageWeapon mageWeapon) {
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
      mage.fireArrow(mageWeapon, barbarian);
    } else if (mageRoll == 2) {
      mage.fireBall(mageWeapon, barbarian);
    } else {
      mage.fireWall(mageWeapon, barbarian);
    }
  }

  public static void getStatus(Barbarian barbarian, Mage mage) {
    System.out.println(barbarian.name + " has the following stats:");
    System.out.println("Strength: " + barbarian.strength);
    System.out.println("Stamina: " + barbarian.stamina);
    System.out.println("Base damage: " + barbarian.baseDamage);
    System.out.println("Health Point: " + barbarian.healthPoint + "\n");
    System.out.println(mage.name + " has the following stats:");
    System.out.println("Intelligence: " + mage.intelligence);
    System.out.println("Stamina: " + mage.stamina);
    System.out.println("Base damage: " + mage.baseDamage);
    System.out.println("Health Point: " + mage.healthPoint + "\n");
  }

  public static void getHP(Barbarian barbarian, Mage mage) {
    System.out.println(barbarian.name + ": " + barbarian.healthPoint + " HP left.");
    System.out.println(mage.name + ": " + mage.healthPoint + " HP left. \n");
  }
}

