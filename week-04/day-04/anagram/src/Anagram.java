public class Anagram {

  public boolean ifAnagram(String word, String otherWord) {
    String reverseWord = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reverseWord += word.charAt(i);
    }

    if (reverseWord.equals(otherWord)) {
      return true;
    } else {
      return false;
    }
  }
}
