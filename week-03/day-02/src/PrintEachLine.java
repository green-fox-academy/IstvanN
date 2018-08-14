import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {

    Path path = Paths.get("/home/archiez/greenfox/IstvanN/week-03/day-02/files/my-file.txt");

    try {
      List lines = Files.readAllLines(path);
      System.out.println(lines);
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + path);
    }
  }
}
