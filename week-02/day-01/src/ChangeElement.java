public class ChangeElement {
  public static void main(String[] args) {

//      Creating the array
    int[] s = {1, 2, 3, 8, 5, 6};

//  Changing the forth element to '4'
    for (int element : s) {
      if (element == s[3]) {
        s[3] = 4;
      }
    }

//    Printing out the fourth element of the array
    System.out.println(s[3]);
  }
}
