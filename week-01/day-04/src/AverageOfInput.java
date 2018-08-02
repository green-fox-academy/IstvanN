import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

//    Creating the scanner
    Scanner scanner = new Scanner(System.in);

// Asking for 5 integers
    System.out.println("Enter a number.");
    int one = scanner.nextInt();

    System.out.println("Enter a number.");
    int two = scanner.nextInt();

    System.out.println("Enter a number.");
    int three = scanner.nextInt();

    System.out.println("Enter a number.");
    int four = scanner.nextInt();

    System.out.println("Enter a number.");
    int five = scanner.nextInt();

//    The sum and the average
    int sum = one + two + three + four + five;
    double average = ((double)sum) / 5;

    System.out.println("Sum: " + sum + ", Average: " + average);
  }
}
