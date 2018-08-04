import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
//    Asking for the number
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:"); // Asking for number
    int userNumb = scanner.nextInt();

//    Asking for the integers
    int sum = 0;

    for (int i = 0; i < userNumb; i++) {
      System.out.println("Please enter an integer:");
      int userInt = scanner.nextInt();
      sum += userInt;
    }

    double average = (double) (sum) / userNumb;
    System.out.println("Sum: " + sum + " Average: " + average);
  }
}
