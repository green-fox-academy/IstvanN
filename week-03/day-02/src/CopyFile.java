import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyFile("my-file.txt", "my-file-copied.txt"));
  }

  public static boolean copyFile(String fileName1, String fileName2) {
//    Setting up the paths
    Path path1 = Paths.get("files/" + fileName1);
    Path path2 = Paths.get("files/" + fileName2);

//    The copy function itself with try-catch
    try {
      Files.copy(path1, path2);
      return true;
    } catch (Exception ex) {
      return false;
    }
  }
}
