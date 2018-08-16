public class String1 {
  public static void main(String[] args) {
    System.out.println(letterConverter("kek", 'k', 'l'));
  }

  public static String letterConverter(String phrase, char charFrom, char charTo) {
    if (phrase.length() < 1) {
      return phrase;
    } else {
      if (phrase.charAt(0) == charFrom) {
        return charTo + letterConverter(phrase.substring(1), charFrom, charTo);
      } else {
        return phrase.charAt(0) + letterConverter(phrase.substring(1), charFrom, charTo);
      }
    }
  }
}
