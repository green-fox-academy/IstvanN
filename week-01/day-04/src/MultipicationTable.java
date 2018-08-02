import java.util.Scanner;

public class MultipicationTable {
  public static void main(String[] args) {

//    First prompting for a number
    System.out.println(" Please enter a number:");
    Scanner scanner = new Scanner(System.in);
    int userNumber = scanner.nextInt();

//    Creating the mult table

    for (int i = 1; i <= 10; i++) {
      int total = i * userNumber;
      System.out.println(i + " * " + userNumber + " = " + total);
    }
  }
}
