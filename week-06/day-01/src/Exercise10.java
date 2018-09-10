import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = Arrays.asList(
        new Fox("fox1", "alopex", "green"),
        new Fox("fox2", "fullvipes", "red"),
        new Fox("fox3", "red", "red"),
        new Fox("fox4", "pallida", "green"),
        new Fox("fox5", "alopex", "white")
    );

    List<Fox> greenFoxes = foxes
        .stream()
        .filter(fox -> fox.getColor().equals("green"))
        .collect(Collectors.toList());
    System.out.println(greenFoxes);

    List<Fox> greenPallidaFoxes = foxes
        .stream()
        .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("pallida"))
        .collect(Collectors.toList());
    System.out.println(greenPallidaFoxes);
  }
}
