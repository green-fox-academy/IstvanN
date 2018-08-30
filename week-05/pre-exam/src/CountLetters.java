import java.util.HashMap;


public class CountLetters {

  public HashMap<Character, Integer> countLetters(String inputString) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      if (!dictionary.containsKey(inputString.charAt(i))) {
        dictionary.put(inputString.charAt(i), 1);
      } else {
        dictionary.put(inputString.charAt(i), dictionary.get(inputString.charAt(i)) + 1);
      }
    }
    return dictionary;
  }
}
