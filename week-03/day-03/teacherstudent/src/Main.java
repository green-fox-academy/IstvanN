public class Main {
  public static void main(String[] args) {
    Student joe = new Student("Joe", 0);
    Teacher emily = new Teacher("Emily", 10);


  }

  public static void getStatus(Student student, Teacher teacher) {
    System.out.println(student.name + " has " + student.knowledge + " knowledge, and " + teacher.name + " has " + teacher.energy + " energy left.");
  }
}
