public class Main {
  public static void main(String[] args) {
    Counter firstCounter = new Counter();
    System.out.println(firstCounter.get());
    firstCounter.add();
    System.out.println(firstCounter.get());
    firstCounter.add();
    System.out.println(firstCounter.get());
    firstCounter.add(10);
    System.out.println(firstCounter.get());
    firstCounter.reset();
    System.out.println(firstCounter.get());

    Counter secondCounter = new Counter(10);
    System.out.println(secondCounter.get());
    secondCounter.add();
    System.out.println(secondCounter.get());
    secondCounter.add();
    System.out.println(secondCounter.get());
    secondCounter.add(50);
    System.out.println(secondCounter.get());
    secondCounter.reset();
    System.out.println(secondCounter.get());
  }
}
