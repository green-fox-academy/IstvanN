import java.util.Random;

public class Main {

  public static void main(String[] args) {
//    Creating the characters
    MageWeapon staff = new MageWeapon("Staff of Fire", 5);
    Mage koni = new Mage("Börne", 4, 8, staff);
    Barbarian archie = new Barbarian("Konan");
    getStatus(archie, koni);
//    T H E  B A T T L E  G R O U N D
    while (true) {
      aRound(archie, koni, staff);
      getHP(archie, koni);
      if (archie.healthPoint <= 0) {
        System.out.println("Ladies and Gentleman! " + archie.name + " has fallen! Our winner is: " + koni.name.toUpperCase() + "!");
        break;
      } else if (koni.healthPoint <= 0) {
        System.out.println("Ladies and Gentleman! " + koni.name + " has fallen! Our winner is: " + archie.name.toUpperCase() + "!");
        break;
      }
    }

  }

  public static void aRound(Barbarian barbarian, Mage mage, MageWeapon mageWeapon) {
    Random random = new Random();
//    Who starts the round
    int whoStarts = random.nextInt(2);
    if (whoStarts == 0) {
      barbarianActs(barbarian, mage);
      mageActs(barbarian, mage, mageWeapon);
    } else {
      mageActs(barbarian, mage, mageWeapon);
      barbarianActs(barbarian, mage);
    }
  }

  public static void barbarianActs(Barbarian barbarian, Mage mage) {
//    What the barbarian does
    Random random = new Random();
    int barbarianRoll = random.nextInt(2);
    if (barbarianRoll == 0) {
      barbarian.battleCry();
    } else {
      barbarian.useWeapon(barbarian, mage);
    }
  }

  public static void mageActs(Barbarian barbarian, Mage mage, MageWeapon mageWeapon) {
    Random random = new Random();
//      What the mage does
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


