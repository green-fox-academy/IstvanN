public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(3));
  }

  public static int numberAdder(int number) {
    if (number > 0) {
      return number + numberAdder(number - 1);
    } else {
      return 0;
    }
  }
}
