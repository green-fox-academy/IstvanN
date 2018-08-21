public class Main {
  public static void main(String[] args) {
    F16 f16 = new F16();
    F35 f35 = new F35();

    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
    System.out.println("Ammo remaining: " + f16.refill(300));
    System.out.println("Ammo remaining: " + f35.refill(300));
    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());
  }
}
