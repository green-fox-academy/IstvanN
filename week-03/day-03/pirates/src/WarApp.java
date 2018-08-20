public class WarApp {
  public static void main(String[] args) {
    Armada pirates = new Armada("Jolly Rogers");
    pirates.fillArmada();
    Armada royal = new Armada("Royal Army");
    royal.fillArmada();

    System.out.println(pirates.size());
    System.out.println(royal.size());
    pirates.war(royal);
  }
}
