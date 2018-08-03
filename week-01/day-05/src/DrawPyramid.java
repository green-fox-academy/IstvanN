import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {

//    Setting up the scanner and asking for user input
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");
    int userNumber = scanner.nextInt();

//    Drawing the pyramid
    String text = "*";
    for (int i = 1; i < userNumber; i++) {
      System.out.println(" " + text);
      text = text + "**";
    }
  }
}
