public class Colors {
  public static void main(String[] args) {

//    Creating the array
    String[][] colorShapes = {
        {"lime", "forest green", "olive", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hotie pink"}
    };

//    Printing out to see if it works
    System.out.println(colorShapes[0][0]);  // it should print lime
    System.out.println(colorShapes[1][2]);  // it should print tomato
    System.out.println(colorShapes[2][1]);  // it should print violet
  }
}
