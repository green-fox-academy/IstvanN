import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
  public static void main(String[] args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

    System.out.println(appendA(far));
  }

  //  This method appends an 'A'
  public static List appendA(List<String> listToBeAppended) {

    List<String> finalList = new ArrayList<String>();

    for (int i = 0; i < listToBeAppended.size(); i++) {
      finalList.add(listToBeAppended.get(i) + "a");
    }

    return finalList;
  }
}
