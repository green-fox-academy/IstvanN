public class MachineMain {
  public static void main(String[] args) {
    Machine machine = new Machine();
    Machine.greeter("Archie");

    machine.noGreeter("Istvan");
    System.out.println(machine.age);
  }
}
