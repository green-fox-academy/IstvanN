import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    System.out.println("Please enter a number:");
    Scanner scanner = new Scanner(System.in);
    int userNumber = scanner.nextInt();

//    Now the if statement

    if (userNumber <= 0) {
      System.out.println("Not enough.");
    } else if (userNumber == 1) {
      System.out.println("One.");
    } else if (userNumber == 2) {
      System.out.println("Two.");
    } else {
      System.out.println("A lot.");
    }
  }
}
