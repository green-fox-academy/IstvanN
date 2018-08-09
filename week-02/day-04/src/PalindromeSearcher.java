import java.util.ArrayList;

public class PalindromeSearcher {
  public static void main(String[] args) {
    String myString = "dog goat dad duck doodle never";

    System.out.println(searchPalindrome(myString));
  }

  public static ArrayList searchPalindrome(String stringToBeInspected) {

    ArrayList<String> arrayOfPalindromes = new ArrayList<>();

    for (int i = 0; i < stringToBeInspected.length(); i++) {
      for (int j = 3; j <= stringToBeInspected.length(); j++) { // j is the amount of how many sequent characters can it scan
        if (i + j <= stringToBeInspected.length()) {
          String partOfString = stringToBeInspected.substring(i, i + j);
          String reverse = reversePhrase(partOfString);

          if (partOfString.equals(reverse)) {
            arrayOfPalindromes.add(partOfString);
          }
        }
      }
    }

    return arrayOfPalindromes;
  }

  public static String reversePhrase(String phraseToBeReversed) {
    String reverse = "";

    for (int i = phraseToBeReversed.length() - 1; i >= 0; i--) {
      reverse = reverse + phraseToBeReversed.charAt(i);
    }

    return reverse;
  }
}
