import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

  public boolean ifAnagram(String word, String otherWord) {
    boolean isTrue = true;
    List<String> wordList = castWordIntoListOfArray(word);
    List<String> otherWordList = castWordIntoListOfArray(otherWord);
    if (wordList.size() != otherWordList.size()) {
      isTrue = false;
    } else {
      for (int i = 0; i < word.length(); i++) {
        if (!wordList.get(i).equals(otherWordList.get(i))) {
          isTrue = false;
          break;
        }
      }
    }
    return isTrue;
  }

  public List<String> castWordIntoListOfArray(String word) {
    List<String> wordList = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      wordList.add(Character.toString(word.charAt(i)));
    }
    eraseSpace(wordList);
    Collections.sort(wordList);
    return wordList;
  }

  public void eraseSpace(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(" ")) {
        list.remove(list.get(i));
      }
    }
  }
}
