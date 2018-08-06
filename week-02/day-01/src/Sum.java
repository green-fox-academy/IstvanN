public class Sum {
  public static void main(String[] args) {

//    Calling the function to try it out
    System.out.println(sum(5));
  }

//  This function will add every number till the given input
  public static int sum(int addNumbersTill) {
    int total = 0;
    for (int i = 1; i <= addNumbersTill; i++) {
      total += i;
    }

    return total;
  }
}
