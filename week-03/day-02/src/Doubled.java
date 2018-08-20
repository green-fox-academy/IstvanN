import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    decryptor("duplicated-chars.txt", "duplicated-chars-decrypted.txt");
  }

  public static Path decryptor(String filename, String newFilename) {
    Path path = Paths.get("files/doubled/" + filename);
    Path newPath = Paths.get("files/doubled/" + newFilename);

    try {
      List<String> lines = Files.readAllLines(path);
      ArrayList<String> decoded = new ArrayList<>();

      for (int i = 0; i < lines.size(); i++) {
        String oneDecodedLine = "";
        for (int j = 0; j < lines.get(i).length(); j++) {
          if (j % 2 == 0) {
            oneDecodedLine += lines.get(i).charAt(j);
          }
        }
        decoded.add(oneDecodedLine);
      }
      Files.write(newPath, decoded);
      return newPath;
    } catch (IOException ex) {
      System.out.println("File is missing.");
      return null;
    }
  }
}
