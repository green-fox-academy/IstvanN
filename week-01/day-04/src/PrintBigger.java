import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//    Asking for the two numbers
    System.out.println("Enter a number.");
    int numberOne = scanner.nextInt();
    System.out.println("Enter another number.");
    int numberTwo = scanner.nextInt();

//    Deciding which one is bigger with IF
    if (numberOne > numberTwo) {
      System.out.println("The first one is bigger.");
    } else if (numberOne == numberTwo) {
      System.out.println("Damn, you ruined the fun since they are even.");
    } else {
      System.out.println("The second one is bigger.");
    }
  }
}
