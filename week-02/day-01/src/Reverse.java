import java.util.Arrays;
import java.util.Collections;

public class Reverse {
  public static void main(String[] args) {

//    Creating the array
    Integer[] aj = {3, 4, 5, 6, 7};

//    Reversing the order of the array
    Collections.reverse(Arrays.asList(aj));

//   Printing out the array
    for (int i = 0; i < aj.length; i++) {
      System.out.print(aj[i] + " ");
    }
  }
}
