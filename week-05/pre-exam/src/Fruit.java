
public class Fruit implements Comparable<Fruit> {
  private String name;
  private int weight;

  public Fruit(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public int compareTo(Fruit otherFruit) {
    return Integer.compare(this.getWeight(), otherFruit.getWeight());
  }
}
