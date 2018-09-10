import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
  public static void main(String[] args) {
    List<Person> list = Arrays.asList(
        new Person("Chris", "Wolstenholme", 40),
        new Person("Matt", "Bellamy", 35),
        new Person("Dom", "Howard", 30)
    );
    list.stream()
        .filter(person -> person.getSecondName().startsWith("W"))
        .forEach(person -> System.out.println(person));
  }
}
