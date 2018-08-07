import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarSystem {
  public static void main(String[] args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    System.out.println(putSaturn(planetList));

  }

  public static List putSaturn(List listToBeCompleted) {
    listToBeCompleted.add("Saturn");
    return listToBeCompleted;
  }
}
