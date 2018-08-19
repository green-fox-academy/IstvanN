public class BattleApp {
  public static void main(String[] args) {
    Ship blackPearl = new Ship("Black Pearl");
    Ship royal = new Ship("Royal Ship");

    blackPearl.fillShip("Jack Sparrow");
    royal.fillShip("Admiral Jackson");
    blackPearl.shipStatus();
    royal.shipStatus();

    blackPearl.battle(royal);
    blackPearl.shipStatus();
    royal.shipStatus();
  }
}
