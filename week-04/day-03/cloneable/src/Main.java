public class Main {
  public static void main(String[] args) {
    Student john = new Student("John", 30, "male", "BME");
    john.introduce();

    Student johnClone = john.clone();
    johnClone.introduce();
  }
}
