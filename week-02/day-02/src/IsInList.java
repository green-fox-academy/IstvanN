import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    System.out.println(checkNums(list));

  }

  //  This function will check if the list contains 4, 8, 12, 16
  public static boolean checkNums(ArrayList listToBeChecked) {
    return (listToBeChecked.contains(4) && listToBeChecked.contains(8) && listToBeChecked.contains(12) && listToBeChecked.contains(16));
  }
}
