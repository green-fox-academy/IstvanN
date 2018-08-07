import java.util.Arrays;

public class UrlFixer {
  public static void main(String[] args) {

//    Defining the string variable
    String url = "https//www.reddit.com/r/nevertellmethebots";

//    Replacing 'bots' to 'odds
    url = url.replace("bots", "odds");
    url = url.replace("https", "https:");

    System.out.println(url);
  }
}
