public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    float inkAmount = 100;
  }

  public float use() {
    inkAmount -= 10;
  }

  public void printStatus() {
    System.out.println("This sharpie has a " + color + "color, it's " +width + "wide, and the current Ink Amount is: " + inkAmount + ".");
  }
}
