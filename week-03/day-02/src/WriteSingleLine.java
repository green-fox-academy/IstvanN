import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;


public class WriteSingleLine {
  public static void main(String[] args) {

    Path path = Paths.get("files/my-file.txt");
    ArrayList<String> myName = new ArrayList<>(Arrays.asList("Istvan Nemeth"));

    try {
      Files.write(path, myName);
    } catch (IOException ex) {
      System.out.println("Unable to write file: " + path);
    }
  }
}
