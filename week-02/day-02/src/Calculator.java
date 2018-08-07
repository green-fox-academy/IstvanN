
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

//    Setting up the scanner
    Scanner scanner = new Scanner(System.in);

//    Greeting and asking for input
    System.out.println("Greetings. Please type in the expression:");
    String userInput = scanner.nextLine();

//    Converting the string userInput into an array
    String[] userInputArray = userInput.split(" ");

    String operation = userInputArray[0];
    Double operatorOne = Double.parseDouble(userInputArray[1]);
    Double operatorTwo = Double.parseDouble(userInputArray[2]);

//    Calling the function
    calculate(operation, operatorOne, operatorTwo);
  }

  //  This is the calculate method
  public static double calculate(String operation, Double numberOne, Double numberTwo) {
    double result = 0;

    if (operation.equals("+")) {
      result = numberOne + numberTwo;
    } else if (operation.equals("-")) {
      result = numberOne - numberTwo;
    } else if (operation.equals("*")) {
      result = numberOne * numberTwo;
    } else if (operation.equals("/")) {
      result = numberOne / numberTwo;
    } else if (operation.equals("%")) {
      result = numberOne % numberTwo;
    }

//    System.out.println(result);
    System.out.println(result);
    return result;
  }
}

