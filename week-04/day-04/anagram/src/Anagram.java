import java.util.Arrays;

public class Anagram {

  public boolean ifAnagram(String word, String otherWord) {
    boolean isTrue = true;
    String[] wordList = castWordIntoListOfArray(word);
    String[] otherWordList = castWordIntoListOfArray(otherWord);
    if (word.length() != otherWord.length()) {
      isTrue = false;
    } else {
      for (int i = 0; i < word.length(); i++) {
        if (!wordList[i].equals(otherWordList[i])) {
          isTrue = false;
          break;
        }
      }
    }
    return isTrue;
  }

  public String[] castWordIntoListOfArray(String word) {
    String[] wordList = new String[word.length()];
    wordList = word.split("");
    Arrays.sort(wordList);
    return wordList;
  }
}
