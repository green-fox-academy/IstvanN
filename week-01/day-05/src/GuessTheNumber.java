import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {

//    Storing a random number
    Random rand = new Random();
    int randomNumber = rand.nextInt(10) + 1;
//    System.out.println(randomNumber); // printing out for testing

//    Asking the user to guess the number
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome! Please guess a number between 1 and 10:");
    int userGuess = scanner.nextInt();

//    Store is done, looping the prompts
    while (userGuess != randomNumber) {  // when it's not a jackpot
      if (userGuess > 10 || userGuess < 1) {  // when it's NOT BETWEEN 1 and 10
        System.out.println("Enter a number between ONE and TEN.");
        userGuess = scanner.nextInt();
      } else if (userGuess > randomNumber) {  // when the guess is GREATER
        System.out.println("Nope, the number is lesser, try again:");
        userGuess = scanner.nextInt();
      } else if (userGuess < randomNumber) { // when the guess is LESSER
        System.out.println("Nope, the number is greater, try again:");
        userGuess = scanner.nextInt();
      }
    }
    if (userGuess == randomNumber) { // JACKPOT
      System.out.println("Yes, exactly, the number was " + randomNumber + ". JACKPOT!");
    }
  }
}