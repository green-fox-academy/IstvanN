import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
//    Asking for number 1

    System.out.println("Please enter your first number:");

    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();

//    Asking for number 2

    System.out.println("Please enter your second number:");
    int secondNumber = scanner.nextInt();

//    The if statements

    if (secondNumber > firstNumber) {
      for (int i = firstNumber; i < secondNumber; i++) {
        System.out.println(i);
      }
    } else {
      System.out.println("The second one should be bigger.");
    }
  }
}
