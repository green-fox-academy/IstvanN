public class Main {
  public static void main(String[] args) {
    Student joe = new Student("Joe", 0);
    Teacher mrsDoubt = new Teacher("Mrs. Doubt", 10);
    getStatus(joe, mrsDoubt);
    joe.learn();
    getStatus(joe, mrsDoubt);
    joe.question(mrsDoubt);
    getStatus(joe, mrsDoubt);
    mrsDoubt.answer();
    getStatus(joe, mrsDoubt);
    mrsDoubt.teach(joe);
    getStatus(joe, mrsDoubt);


  }

  public static void getStatus(Student student, Teacher teacher) {
    System.out.println(student.name + " has " + student.knowledge + " knowledge, and " + teacher.name + " has " + teacher.energy + " energy left.");
  }
}
