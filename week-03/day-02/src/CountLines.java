import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    System.out.println(lineCounter("my-file.txt"));
  }

  public static int lineCounter(String filename) {
    Path path = Paths.get(filename);

    try {
      List<String> lines = Files.readAllLines(path);
      return lines.size();
    } catch (IOException ex) {
      return 0;
    }
  }
}
