public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing milk = new Thing("Get milk");
    fleet.add(milk);

    Thing obstacles = new Thing("Remove the obstacles");
    fleet.add(obstacles);

    Thing standUp = new Thing("Stand up");
    standUp.complete();
    fleet.add(standUp);

    Thing eatLunch = new Thing("Eat lunch");
    eatLunch.complete();
    fleet.add(eatLunch);

    System.out.println(fleet);
  }
}
