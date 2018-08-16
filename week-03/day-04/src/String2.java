public class String2 {
  public static void main(String[] args) {
    System.out.println(charRemover("abbbbabbbabbbbbabbbbabbbabbbabbb", 'b'));
  }

  public static String charRemover(String phrase, char charToRemove) {
    if (phrase.length() < 1) {
      return phrase;
    } else {
      if (phrase.charAt(0) == charToRemove) {
        return charRemover(phrase.substring(1), charToRemove);
      } else {
        return phrase.charAt(0) + charRemover(phrase.substring(1), charToRemove);
      }
    }
  }
}
