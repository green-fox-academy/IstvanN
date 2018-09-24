import java.util.Arrays;

public class Anagram {

  public static boolean checkAnagram(String word1, String word2) {
    if (word1.equals(word2) || word1.contains(" ") || word2.contains(" ")) {
      return false;
    }

    char[] firstWordLetters = word1.toLowerCase().toCharArray();
    char[] secondWordLetters = word2.toLowerCase().toCharArray();

    Arrays.sort(firstWordLetters);
    Arrays.sort(secondWordLetters);

    return (Arrays.equals(firstWordLetters, secondWordLetters));
  }
}
