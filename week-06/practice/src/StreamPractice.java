import java.util.Arrays;
import java.util.List;

public class StreamPractice {
  public static void main(String[] args) {
    List<Person> list = Arrays.asList(
        new Person("Chris", "Wolstenholme", 40),
        new Person("Matt", "Bellamy", 35),
        new Person("Dom", "Howard", 30)
    );

    list.stream()
        .filter(p -> p.getAge() >= 35 && p.getFirstName().startsWith("M"))
        .map(person -> person.getSecondName().toUpperCase())
        .forEach(p -> System.out.println(p.toString()));
  }
}
