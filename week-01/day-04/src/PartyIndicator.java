import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//    Asking for girls
    System.out.println("How many girls?");
    int girlsNumber = scanner.nextInt();

//    Asking for boys
    System.out.println("How many boys?");
    int boysNumber = scanner.nextInt();

//    Total amount
    int total = girlsNumber + boysNumber;

//    The if comes in
    if (girlsNumber == 0) {
      System.out.println("Sausage party.");
    } else if (total >= 20 && girlsNumber == boysNumber) {
      System.out.println("The Party is excellent!");
    } else if (total >= 20 && girlsNumber != boysNumber) {
      System.out.println("Quite cool party!");
    } else {
      System.out.println("Average party...");
    }
  }
}
