public class Cuboid {
  public static void main(String[] args) {
//    The 3 sides
    double a = 15.56;
    double b = 45.67;
    double c = 93.2;

//    The surface area
    double surfaceArea = 2 * (a * b + a * c + b * c);
    System.out.println("The couboid's surface area is: " + surfaceArea);

//    The volume
    double volume = a * b * c;
    System.out.println("The cuboid's volume is: " + volume);
  }
}
