import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Homework {
  public static void main(String[] args) {
    List<HashMap<String, Object>> trees = new ArrayList<>();

    HashMap<String, Object> oak = new HashMap<>();
    oak.put("type", "oak");
    oak.put("leaf color", "brown");
    oak.put("age", 60);
    oak.put("sex", "male");
    trees.add(oak);

    HashMap<String, Object> pinetree = new HashMap<>();
    pinetree.put("type", "pinetree");
    pinetree.put("leaf color", "green");
    pinetree.put("age", 45);
    pinetree.put("sex", "female");
    trees.add(pinetree);

    HashMap<String, Object> cherry = new HashMap<>();
    cherry.put("type", "cherry");
    cherry.put("leaf color", "red");
    cherry.put("age", 20);
    cherry.put("sex", "female");
    trees.add(cherry);

    HashMap<String, Object> birch = new HashMap<>();
    birch.put("type", "birch");
    birch.put("leaf color", "yellow");
    birch.put("age", 55);
    birch.put("sex", "male");
    trees.add(birch);

    HashMap<String, Object> palm = new HashMap<>();
    palm.put("type", "pal,");
    palm.put("leaf color", "green");
    palm.put("age", 15);
    palm.put("sex", "female");
    trees.add(palm);

    System.out.println(trees);
  }
}
