public class DivideByZero {
  public static void main(String[] args) {

    divider(0);
  }

  public static void divider(int number) {

    try {
      double result = 10 / number;
      System.out.println(result);
    } catch (Exception ex) {
      System.out.println("fail");
    }
  }
}
