public class AppendA {
  public static void main(String[] args) {

//    Creating the array
    String[] animals = {"koal", "pand", "zebr"};

//      Adding an 'a' to the ends of all elements
    for (String animal : animals) {
      animal += "a";
      System.out.println(animal);  // Printing to see if it works
    }
  }
}
