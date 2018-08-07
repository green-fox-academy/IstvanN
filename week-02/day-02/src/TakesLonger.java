public class TakesLonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    String stringToBeAdded = "always takes longer than";

//   Slicing up the quote to two parts
    String quotePartOne = quote.substring(0, 21);
    String quotePartTwo = quote.substring(20, quote.length());

    quote = quotePartOne + stringToBeAdded + quotePartTwo;
    System.out.println(quote);
  }
}
