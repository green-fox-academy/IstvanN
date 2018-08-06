public class PrintParams {
  public static void main(String[] args) {

//    Trying out the function
    printParams("hi", "sup");
    printParamsForEach("what", "the", "actual");
  }

  //  This function prints the input String parameters
  public static void printParams(String... inputToPrint) {
    for (int i = 0; i < inputToPrint.length; i++) {
      System.out.println(inputToPrint[i] + " ");
    }
  }

  //  Trying to build the same function with 'foreach' loop
  public static void printParamsForEach(String... inputToPrint) {
    for (String inputs : inputToPrint) {
      System.out.println(inputs);
    }
  }
}
