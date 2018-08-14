import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {

    Path path = Paths.get("my-file.txt");

    try {
      List lines = Files.readAllLines(path);
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + path);
    }
  }
}
