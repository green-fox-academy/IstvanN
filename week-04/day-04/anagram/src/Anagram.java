import java.util.ArrayList;
import java.util.List;

public class Anagram {

//  public boolean ifAnagram(String word, String otherWord) {
//    ArrayList<Character> wordList = new ArrayList<>();
//    ArrayList<Character> otherWordList = new ArrayList<>();
//    for (int i = 0; i < word.length(); i++) {
//      wordList.add(word.charAt(i));
//    }
//
//  }

  public List castWordIntoListOfChars(String word) {
    ArrayList<Character> wordList = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      wordList.add(word.charAt(i));
    }

    return wordList;
  }
}
