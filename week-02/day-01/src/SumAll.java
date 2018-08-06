public class SumAll {
  public static void main(String[] args) {

//    Creating the variable
    int[] a1 = {3, 4, 5, 6, 7};

//    Printing the sum of its element
    int total = 0;
    for (int number : a1) {
      total += number;
    }
    System.out.println(total);
  }
}
