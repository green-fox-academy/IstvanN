import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {

  }

  public static ArrayList getIP(String filename) {

//    Setting up the path of the method
    Path path = Paths.get("files/" + filename);
//    Setting up the content arraylist
    try {
      List<String> content = Files.readAllLines(path);
    } catch (Exception ex) {
      System.out.println("Couldn't read the file: " + filename);
    }

//    Setting up an empty list for the IP addresses
    ArrayList<String> listOfIP = new ArrayList<>();

//    Adding the IP addresses to the empty list
    

    return listOfIP;
  }
}
