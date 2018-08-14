import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
//    Setting up the path
    Path path = Paths.get("files/log.txt");

//    Adding the content to an arraylist
    try {
      List<String> content = Files.readAllLines(path);
    } catch (Exception ex) {
      System.out.println("There was a problem with the following file: " + path);
    }
  }
}
