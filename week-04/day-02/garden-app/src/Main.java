public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower yellowFlower = new Flower("yellow");
    garden.addPlant(yellowFlower);
    Flower blueFlower = new Flower("blue");
    garden.addPlant(blueFlower);
    Tree purpleTree = new Tree("purple");
    garden.addPlant(purpleTree);
    Tree orangeTree = new Tree("orange");
    garden.addPlant(orangeTree);
  }
}
