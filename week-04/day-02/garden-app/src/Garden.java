import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public int calculateNeedWatering() {
    int plantsNeedWatering = 0;
    for (Plant plant : plants) {
      if (plant.ifNeedsWater()) {
        plantsNeedWatering++;
      }
    }
    return plantsNeedWatering;
  }

  public void water(int wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
    double equalAmount = wateringAmount / calculateNeedWatering();
    for (Plant plant : plants) {
      plant.waterThePlant(equalAmount);
    }
  }

  public void showGarden() {
    for (Plant plant : plants) {
      plant.showPlantStatus();
    }
    System.out.println("");
  }
}
