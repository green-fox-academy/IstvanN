public class Pirate {
  int rumLevel;
  boolean alive;

  public Pirate() {
    rumLevel = 0;
    alive = true;
  }

  public int drinkSomeRum() {
    rumLevel++;
    System.out.println("Zzz...");
    return rumLevel;
  }
}
