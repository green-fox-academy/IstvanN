public class Counter {
  public static void main(String[] args) {
    countDown(5);
  }

  public static int countDown(int number) {
    if (number == 0) {
      System.out.println(number);
      return number;
    } else {
      System.out.println(number);
      return countDown(number - 1);
    }
  }
}
