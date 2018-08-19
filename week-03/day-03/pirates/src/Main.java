public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();
    
    pirate1.brawl(pirate2);
    pirate1.getStatus();
    pirate2.getStatus();
  }
}
