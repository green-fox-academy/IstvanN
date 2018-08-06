import java.util.ArrayList;


public class Unique {
  public static void main(String[] args) {

//    Printing to try out if it works
    System.out.println(removeDuplicates(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));

  }


//  This function takes a list of numbers as parameters, and removes the duplicates
  public static ArrayList removeDuplicates(int[] originalList) {
    ArrayList<Integer> uniqueList = new ArrayList();
    for (int number : originalList) {
      if (!uniqueList.contains(number)) {
        uniqueList.add(number);
      }
    }
    return uniqueList;
  }
}