public class Plant {
  String color;
  double waterLevel;
  int waterNeed;
  double waterAbsorb;
  String type;

  public Plant() {
    waterLevel = 0;
  }

  public void showPlantStatus() {
    if (waterLevel < waterNeed) {
      System.out.println("The " + color + " " + type + " needs water.");
    } else {
      System.out.println("The " + color + " " + type + " doesn't need water.");
    }
  }
}
