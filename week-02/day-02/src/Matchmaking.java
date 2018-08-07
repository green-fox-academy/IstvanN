import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
    System.out.println(makingMatches(girls, boys));  // Poor Jeff...
  }

  //  This function matches girls and boys in the list
  public static ArrayList<String> makingMatches(ArrayList<String> listOne, ArrayList<String> listTwo) {

//    Making an empty list
    ArrayList<String> matchedList = new ArrayList<>();

    for (int i = 0; i < listOne.size(); i++) {
      matchedList.add(listOne.get(i));
      matchedList.add(listTwo.get(i));
    }

    return matchedList;
  }
}
