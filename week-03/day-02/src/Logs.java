import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {

    getIP("log.txt");

  }

  public static ArrayList getIP(String filename) {

//    Setting up the path of the method
    Path path = Paths.get("files/" + filename);

//    Setting up the content arraylist and put the content in it with try-catch
    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(path);
    } catch (Exception ex) {
      System.out.println("Couldn't read the file: " + filename);
    }

//    Setting up an empty list for the IP addresses
    ArrayList<String> listOfIP = new ArrayList<>();

//    Adding the IP addresses to the empty list
    for (String line : content) {
      List<String> IP = new ArrayList<>(Arrays.asList(line.split("   ")));
      if (!listOfIP.contains(IP.get(1))) {
        listOfIP.add(IP.get(1));
      }
    }

//    Writing the list to a new file
    Path pathNew = Paths.get("files/log-IP.txt");

    try {
      Files.write(pathNew, listOfIP);
    } catch (Exception ex) {
      System.out.println("Couldn't write the file: " + pathNew);
    }
    return listOfIP;
  }

//  public static double countGetPostRatio(String filename) {
//
//  }
}
