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
      if (plant.waterLevel < plant.waterNeed) {
        plantsNeedWatering++;
      }
    }
    return plantsNeedWatering;
  }

  public void water(int wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
    double equalAmount = wateringAmount / scanGarden();
    for (Plant plant : plants) {
      if (plant.waterLevel < plant.waterNeed) {
        plant.waterLevel += equalAmount * plant.waterAbsorb;
      }
    }
  }
}
