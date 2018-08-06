public class Greet {
  public static void main(String[] args) {

//    Creating the variable
    String a1 = "Greenfox";

//    Calling the greet function to greet a1
    greet(a1);
  }

//  This function greets the input parameter
  public static void greet(String inputToGreet) {
    System.out.println("Greetings, dear " + inputToGreet + "!");
  }
}
