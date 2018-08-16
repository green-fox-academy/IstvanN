public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEarCounter(15));
  }

  public static int bunnyEarCounter(int numberOfBunnies) {
    if (numberOfBunnies == 0) {
      return 0;
    } else {
      return 2 + bunnyEarCounter(numberOfBunnies - 1);
    }
  }
}
