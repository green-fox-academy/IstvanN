
public class Anagram {

  public boolean ifAnagram(String word, String otherWord) {
    char[] wordSorted = castWordIntoListOfChars(word);
    char[] otherWordSorted = castWordIntoListOfChars(otherWord);

    if (wordSorted == otherWordSorted) {
      return true;
    } else {
      return false;
    }
  }

  public char[] castWordIntoListOfChars(String word) {
    char[] wordList = new char[word.length()];
    for (int i = 0; i < word.length(); i++) {
      wordList[i] = (word.charAt(i));
    }
    return wordList;
  }
}
