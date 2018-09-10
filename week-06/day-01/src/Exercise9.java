import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    char[] testArray = {'w', 'o', 'w'};
    System.out.println(convertCharArrayToString(testArray));
  }

  public static String convertCharArrayToString(char[] inputArray) {
    return Stream.of(inputArray)
        .map(c -> String.valueOf(c))
        .collect(Collectors.joining());
  }
}
