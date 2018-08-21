public class Main {
  public static void main(String[] args) {
    F16 f16 = new F16();
    F35 f35 = new F35();
    Carrier carrier = new Carrier(15, 100);
    carrier.add(f16);
    carrier.add(f35);
    carrier.fillAll();
    System.out.println(carrier.getStatus());

    F16 enemyf16 = new F16();
    F35 enemyf35 = new F35();
    Carrier enemyCarrier = new Carrier(15, 700);
    enemyCarrier.add(enemyf16);
    enemyCarrier.add(enemyf35);
    enemyCarrier.fillAll();
    System.out.println(enemyCarrier.getStatus());
    System.out.println("A F T E R  T H E  B A T T L E \n");
    carrier.fight(enemyCarrier);
    System.out.println(carrier.getStatus());
    System.out.println(enemyCarrier.getStatus());
  }
}
