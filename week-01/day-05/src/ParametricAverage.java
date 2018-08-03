import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
//    Asking for the number
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");
    int userNumb = scanner.nextInt();

//    Asking for the integers
    for (int i = 0; i < userNumb; i++) {
      System.out.println("Please enter an integer");
      int userInt = scanner.nextInt();
    }
  }
}
