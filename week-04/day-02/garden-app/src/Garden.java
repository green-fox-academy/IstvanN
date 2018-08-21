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

  public int scanGarden() {
    int plantsNeedWatering = 0;
    for (Plant plant : plants) {
      if (plant.waterAmount < plant.waterNeed) {
        plantsNeedWatering++;
      }
    }
    return plantsNeedWatering;
  }

  public void water(int wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
    int divider = scanGarden();
    for (Plant plant : plants) {
      if (plant.waterAmount < plant.waterNeed) {
        
      }
    }
  }
}
