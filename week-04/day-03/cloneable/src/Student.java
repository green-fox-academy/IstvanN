public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public Student() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("My goal is: Be a juniour software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
    return skippedDays;
  }

  public Student clone() {
    Student cloneStudent = new Student();
    try {
      cloneStudent = (Student) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return cloneStudent;
  }
}
