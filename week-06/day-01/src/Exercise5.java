import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    String upperCaseLetters = "World Of Warcraft";
    List<Character> wow = collectUppercaseCharacters(upperCaseLetters);
    System.out.println(wow);
  }

  public static List<Character> collectUppercaseCharacters(String input) {
    return input.chars()
        .filter(c -> c >= 65 && c <= 90)
        .mapToObj(c -> Character.valueOf((char) c))
        .collect(Collectors.toList());
  }
}
