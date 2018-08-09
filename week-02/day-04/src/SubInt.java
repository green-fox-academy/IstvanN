import java.util.ArrayList;
import java.util.List;

public class SubInt {
  public static void main(String[] args) {
    subInt(1, new int[]{39, 5, 46, 49});


  }

  public static List subInt(Integer number, int[] originalArray) {

    List<String> listOfStrings = new ArrayList<>();

//    Looping thru the array to put the values as Strings to a new List
    for (int i = 0; i < originalArray.length; i++) {
      listOfStrings.add(i, String.valueOf(originalArray[i]));
    }

//    Checking if the element of the new list has the number in it (as a string)
    List<String> tempList = new ArrayList<>();

    for (int i = 0; i < listOfStrings.size(); i++) {
      if (listOfStrings.get(i).contains(number.toString())) {
        tempList.add(listOfStrings.get(i));
      } // now I have a list full of strings containing the number
    }

    List<Integer> listToReturn = new ArrayList<>();
    for (int i = 0; i < tempList.size(); i++) {
      if (listOfStrings.contains(tempList.get(i))) {
        listToReturn.add(listOfStrings.indexOf(tempList.get(i)));
      }
    }

    System.out.println(listToReturn);
    return listToReturn;
  }
}
