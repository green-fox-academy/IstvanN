public class SwapElements {
  public static void main(String[] args) {

//    Creating the array
    String[] abc = {"first", "second", "third"};

    for (String element : abc) {
      System.out.println(element);  // Printing out to see if it works
    }

    System.out.print("\n");  // New line to see the difference

//    Swapping the first and the third element of the array
    String somethingNew = abc[0];
    abc[0] = abc[2];
    abc[2] = somethingNew;

    for (String element : abc) {
      System.out.println(element); // Printing out to see if it worked
    }
  }
}
