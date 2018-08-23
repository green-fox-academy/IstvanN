import java.util.Arrays;

public class Anagram {

  public boolean ifAnagram(String word, String otherWord) {
    String[] wordList = castWordIntoListOfArray(word);
    String[] otherWordList = castWordIntoListOfArray(otherWord);

    Arrays.sort(wordList);
    Arrays.sort(otherWordList);

    if (wordList == otherWordList) {
      return true;
    } else {
      return false;
    }

  }

  public String[] castWordIntoListOfArray(String word) {
    String[] wordList = new String[word.length()];
    wordList = word.split("");
    return wordList;
  }
}
