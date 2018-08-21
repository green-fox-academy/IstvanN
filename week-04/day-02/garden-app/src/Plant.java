public class Plant {
  String color;
  double waterLevel;
  int waterNeed;
  double waterAbsorb;
  String type;

  public Plant() {
    waterLevel = 0;
  }

  public boolean ifNeedsWater() {
    if (waterLevel < waterNeed) {
      return true;
    } else {
      return false;
    }
  }

  public void showPlantStatus() {
    if (ifNeedsWater()) {
      System.out.println("The " + color + " " + type + " needs water.");
    } else {
      System.out.println("The " + color + " " + type + " doesn't need water.");
    }
  }

  public void waterThePlant(double amountToWater) {
    if (ifNeedsWater()) {
      waterLevel += amountToWater * waterAbsorb;
    }
  }
}
