public class Person {
  private String firstName;
  private String secondName;
  private int age;

  public Person(String firstName, String secondName, int age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public int getAge() {
    return age;
  }

  public String toString() {
    return firstName + " " + secondName + ", " + age;
  }
}
