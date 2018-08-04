import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {

//    Setting up the scanner and prompting for the number
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number!");
    int squareLong = scanner.nextInt();  // The longness of the square

//    Defining the sides
    String fullSide = "%%%%%";  // The first and the numberth side
    String holeSide = "%   %";  // All the other 'sides'

//    The for loop
    for (int i = 0; i < squareLong; i++) {
      if (i == 0 || i == (squareLong - 1)) {  // The first and the numberth side
        System.out.println(fullSide);
      } else {                                  // All the other sides
        System.out.println(holeSide);
      }
    }
  }
}