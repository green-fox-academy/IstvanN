import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(containsSeven(arrayList));
    System.out.println(ifContainsSeven(arrayList));
  }

  //  First solution
  public static String containsSeven(ArrayList listToBeInspected) {
    if (listToBeInspected.contains(7)) {
      return "Hooooraaaaay";
    } else {
      return "Nooooooooo";
    }
  }

  //  Second solution
  public static String ifContainsSeven(ArrayList listToBeInspected) {

    if (listToBeInspected.indexOf(7) == -1) {
      return "Noooooo";
    } else {
      return "Hooooorrraaaayy";
    }
  }
}
