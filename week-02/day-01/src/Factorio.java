public class Factorio {
  public static void main(String[] args) {

//    Trying out the function
    System.out.println(factorio(5));
  }

  //  This function returns the input's factorial
  public static int factorio(int numberToFactorio) {
    if (numberToFactorio == 0) {
      return 0;
    } else {
      int total = 1;
      for (int i = 1; i <= numberToFactorio; i++) {
        total *= i;
      }
      return total;
    }
  }
}
