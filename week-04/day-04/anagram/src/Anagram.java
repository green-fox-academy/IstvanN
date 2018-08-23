import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

//  public boolean ifAnagram(String word, String otherWord) {
//    ArrayList wordSort = Collections.sort();
//
//  }

  public char[] castWordIntoListOfChars(String word) {
    char[] wordList = new char[word.length()];
    for (int i = 0; i < word.length(); i++) {
      wordList[i] = (word.charAt(i));
    }
    return wordList;
  }
}
