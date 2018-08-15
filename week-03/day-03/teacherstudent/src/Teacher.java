public class Teacher {
  String name;
  int energy;

  public Teacher(String name, int energy) {
    this.name = name;
    this.energy = energy;
  }

  public int answer() {
    energy--;
    return energy;
  }

  public void teach(Student student) {
    student.learn();
  }
}
