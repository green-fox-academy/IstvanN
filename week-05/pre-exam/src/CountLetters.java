import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountLetters {

  public HashMap<String, Integer> countLetters(String inputString) {
    HashMap<String, Integer> dictionary = new HashMap<>();
    List<Character> listOfLetters = new ArrayList<>();
    for (int i = 0; i < inputString.length(); i++) {
      listOfLetters.add(inputString.charAt(i));
    }
    Collections.sort(listOfLetters);
    int count = 0;
    Character element = listOfLetters.get(0);
    
  }
}
}
