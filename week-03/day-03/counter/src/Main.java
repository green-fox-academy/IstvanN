public class Main {
  public static void main(String[] args) {
    Counter firstCounter = new Counter();
    System.out.println(firstCounter.get());
    firstCounter.add();
    System.out.println(firstCounter.get());
    firstCounter.add();
    System.out.println(firstCounter.get());
  }
}
