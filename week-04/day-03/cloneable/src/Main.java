public class Main {
  public static void main(String[] args) {
    Student john = new Student("John", 40, "male", "BME");
    john.introduce();

    Student johnClone = john.clone();
    johnClone.introduce();
    System.out.println(john);
    System.out.println(johnClone);
  }
}
