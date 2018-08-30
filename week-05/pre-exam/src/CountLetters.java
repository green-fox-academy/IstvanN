import java.util.HashMap;


public class CountLetters {

  public HashMap<String, Integer> countLetters(String inputString) {
    HashMap<String, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      String character = inputString.charAt(i) + "";
      if (!dictionary.containsKey(character)) {
        dictionary.put(character, 1);
      } else {
        dictionary.put(character, dictionary.get(character) + 1);
      }
    }
    return dictionary;
  }
}
