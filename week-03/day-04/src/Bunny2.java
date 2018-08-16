public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(bunnyEarCounterWithRaisedFoot(2));
  }

  public static int bunnyEarCounterWithRaisedFoot(int numberOfBunnies) {
    if (numberOfBunnies == 0) {
      return 0;
    } else if (numberOfBunnies % 2 == 0) {
      return 3 + bunnyEarCounterWithRaisedFoot(numberOfBunnies - 1);
    } else {
      return 2 + bunnyEarCounterWithRaisedFoot(numberOfBunnies - 1);
    }
  }
}
