import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class WriteMultipleLines {
  public static void main(String[] args) {
    writeToFile("files/my-file.txt", "Paranoid Android", 4);
  }

  public static void writeToFile(String filePath, String word, int numberOfLines) {

//    I setup the path
    Path path = Paths.get(filePath);

//    Adding the 'word' 'numberOfLines' times to the arraylist
    ArrayList<String> lines = new ArrayList<>();
    for (int i = 0; i < numberOfLines; i++) {
      lines.add(word);
    }

//    Try and catch if error
    try {
      Files.write(path, lines);
    } catch (Exception ex) {
      
    }

  }
}
