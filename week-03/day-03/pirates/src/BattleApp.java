public class BattleApp {
  public static void main(String[] args) {
    Ship blackPearl = new Ship("Black Pearl");
    Ship royal = new Ship("Royal Ship");

    blackPearl.fillShip("Jack Sparrow");
    royal.fillShip("Admiral Jackson");

    for (int i = 0; i < 5; i++) {
      royal.letTheCaptainDrink();
    }
    
    blackPearl.shipStatus();
    royal.shipStatus();


    blackPearl.battle(royal);
  }
}
