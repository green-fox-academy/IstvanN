import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
//    Asking for the chickens
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many chicken does the farmer have?");
    int chicken = scanner.nextInt();

//    Asking for the pigs
    System.out.println("How many pigs does the farmer have?");
    int pig = scanner.nextInt();

//    Calculating and printing the number of legs
    int legs = 2 * chicken + 2 * pig;
    System.out.println("The yard contains " + legs + " legs.");
  }
}
