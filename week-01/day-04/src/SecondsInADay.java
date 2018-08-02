public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

//    My variables

    int currentTimeInSeconds = currentHours * 3600 + currentMinutes * 60 + currentSeconds; // 52482 seconds
    int aDayInSeconds = 24 * 3600;

    int remainingSeconds = aDayInSeconds - currentTimeInSeconds;

    System.out.println(remainingSeconds);

  }
}
