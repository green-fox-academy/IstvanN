import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    System.out.println(findFrequenciesOfCharsIn("wowenwilson"));
  }

  public static Map<Character, Long> findFrequenciesOfCharsIn(String input) {
    return input.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }
}
