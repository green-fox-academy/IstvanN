public class Main {
  public static void main(String[] args) {
    Sharpie pen = new Sharpie("blue", 50);
    Sharpie pen2 = new Sharpie("black", 20);
    Sharpie pen3 = new Sharpie("yellow", 100);
    Sharpie penUnUsable = new Sharpie("white", 20);

    SharpieSet set = new SharpieSet();
    set.add(pen);
    set.add(pen2);
    set.add(pen3);
    getStatus(set);

    for (int i = 0; i < 10; i++) {
      pen.use();
    }
    getStatus(set);
    set.removeTrash();
    getStatus(set);

    for (int i = 0; i < 10; i++) {
      pen2.use();
    }
    set.removeTrash();
    getStatus(set);
  }

  public static void getStatus(SharpieSet sharpies) {
    System.out.println("The sharpies list currently contains: " + sharpies.countAll() + " items and " + sharpies.countUsable() + " is usable.");
  }
}
