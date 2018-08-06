
public class AppendAFunc {
  public static void main(String[] args) {

//    Creating the 'typo' variable
    String typo = "Chinchill";

//    Printing the result of the function
    System.out.println(appendAFunc(typo));
  }

//  This function adds a "a" to the end of the string
  public static String appendAFunc(String stringToAppendTo) {
    return stringToAppendTo + "a";
  }
}
