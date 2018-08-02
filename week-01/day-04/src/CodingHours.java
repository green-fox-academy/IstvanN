public class CodingHours {
  public static void main(String[] args) {

//    Defining the variables

    int codingDaily = 6;
    int semesterLong = 17;
    int weekLong = 5;
    int codingTotally = codingDaily * semesterLong * weekLong; // 510 hours
    int workhourWeekly = 52;
    double codingPercentage = ((double)codingTotally) / (semesterLong * workhourWeekly) * 100;

    System.out.println("We spend " + codingTotally + " hours coding in a semester.");
    System.out.println("We spend " + ((int)codingPercentage) + "% of the full amount of hours coding. Wow!");
  }
}
