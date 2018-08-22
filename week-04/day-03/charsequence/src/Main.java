public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    System.out.println(g.string);

    Shifter s = new Shifter("rekt", 2);
    System.out.println(s.charAt(0));
    System.out.println(s.string);
  }
}
