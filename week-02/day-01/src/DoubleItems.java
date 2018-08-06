public class DoubleItems {
  public static void main(String[] args) {

//    Creating the array
    int[] numList = {3, 4, 5, 6, 7};

//    Doubling all the elements
    for (int number : numList) {
      number *= 2;
      System.out.print(number + " ");  // Printing to see if it worked
    };
  }
}
