public class Main {
  public static void main(String[] args) {
    F16 f16 = new F16();
    F35 f35 = new F35();
    F35 f352 = new F35();
    Carrier carrier = new Carrier(20, 100);
    carrier.add(f16);
    carrier.add(f35);
    carrier.add(f352);
    System.out.println(carrier.getStatus());
    carrier.fillAll();
    System.out.println(carrier.getStatus());
  }
}
