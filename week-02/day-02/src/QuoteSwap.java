import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    System.out.println(quoteSwap(list));
  }

  public static String quoteSwap(ArrayList<String> listToBeCorrected) {

    String finalString = "";

    for (int i = 0; i < listToBeCorrected.size(); i++) {
      if (listToBeCorrected.get(i) == "do") {
        finalString += "cannot ";
      } else if (listToBeCorrected.get(i) == "cannot") {
        finalString += ("do ");
      } else {
        finalString += (listToBeCorrected.get(i)) + " ";
      }
    }

    return finalString;
  }
}
