import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a whole number:");
    int userNumber = scanner.nextInt();

//    Defining if it's even or not

    if (userNumber % 2 == 0) {
      System.out.println("Even.");
    } else {
      System.out.println("Odd.");
    }
  }
}
