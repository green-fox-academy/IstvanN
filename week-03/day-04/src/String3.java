public class String3 {
  public static void main(String[] args) {
    System.out.println(starCreator("what the fck"));
  }

  public static String starCreator(String phrase) {
    if (phrase.length() < 1) {
      return phrase;
    } else {
      if (phrase.startsWith(" ")) {
        return phrase.charAt(0) + starCreator(phrase.substring(1));
      } else {
        return phrase.charAt(0) + "*" + starCreator(phrase.substring(1));
      }
    }
  }
}
