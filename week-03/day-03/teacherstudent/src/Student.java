public class Student {
  String name;
  int knowledge;

  public Student(String name, int knowledge) {
    this.name = name;
    this.knowledge = knowledge;
  }

  public int learn() {
    knowledge++;
    return knowledge;
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }

  public void printStatus() {
    System.out.println(name + " has " + knowledge + " knowledge.");
  }
}

