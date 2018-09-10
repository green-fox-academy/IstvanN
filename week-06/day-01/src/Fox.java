/* This is the class
for exercise 10
 */
public class Fox {
  String name;
  String type;
  String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Fox{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", color='" + color + '\'' +
        '}';
  }
}
