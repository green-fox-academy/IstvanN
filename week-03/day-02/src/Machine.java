public class Machine {
  public int age;

  public Machine() {
    System.out.println("Constructor running!");
    age = 10;
  }

  public static void greeter(String name) {
    System.out.println("I greet you, " + name + "!");
  }

  public void noGreeter(String name) {
    System.out.println("I hate you " + name + "!");
  }
}
