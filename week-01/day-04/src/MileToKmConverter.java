import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number in kilometers to be converted: ");
    int userKm = scanner.nextInt();
    double userInMi = userKm * 0.62137119224;
    System.out.println(userKm + " kilometers equals " + userInMi + " miles.");
  }
}
