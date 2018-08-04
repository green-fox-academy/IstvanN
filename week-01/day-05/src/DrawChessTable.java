public class DrawChessTable {
  public static void main(String[] args) {

//    Creating variables
    String textEven = "% % % %";
    String textOdd = " % % % %";

//    The loop
    for (int i = 0; i < 8; i++) {
      if (i % 2 == 0) {  // Every even numbered line
        System.out.println(textEven);
      } else {  // Every odd numbered line
        System.out.println(textOdd);
      }
    }
  }
}