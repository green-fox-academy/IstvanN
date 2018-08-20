public class WarApp {
  public static void main(String[] args) {
    Armada pirates = new Armada("Jolly Rogers");
    pirates.fillArmada();
    Armada royal = new Armada("Royal Army");
    royal.fillArmada();

    System.out.println(pirates.name + " armada size is: " + pirates.size());
    System.out.println(royal.name + " armada size is: " + royal.size() + "\n");
    System.out.println("LET THE BATTLE BEGIN!");
    pirates.war(royal);
  }
}
