public class Exercise5 {
  public static void main(String[] args) {
    String upperCaseLetters = "World Of Warcraft";
    collectUppercaseCharacters(upperCaseLetters);
  }

  public static void collectUppercaseCharacters(String input) {
    input.chars()
        .filter(c -> c >= 65 && c <= 90)
        .mapToObj(c -> Character.toString((char) c))
        .forEach(System.out::print);
  }
}
