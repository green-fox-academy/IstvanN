public class Main {
  public static void main(String[] args) {
    Sharpie pen = new Sharpie("blue", 50);
    pen.printStatus();

    for (int i = 0; i < 8; i++) {
      pen.use();
    }

    pen.printStatus();
  }
}
