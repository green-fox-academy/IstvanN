public class Main {

  public static void main(String[] args) {
    Barbarian archie = new Barbarian("Konan");
    getStatus(archie);
    archie.battleCry();
    getStatus(archie);
  }

  public static void getStatus(Barbarian barbarian) {
    System.out.println(barbarian.name + " has the following stats:");
    System.out.println("Strength: " + barbarian.strength);
    System.out.println("Stamina: " + barbarian.stamina);
    System.out.println("Health Point: " + barbarian.healthPoint);
    System.out.println("Base damage: " + barbarian.baseDamage);
  }
}

