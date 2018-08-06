public class DiagonalMatrix {
  public static void main(String[] args) {

//    Creating (an empty) array for 16 integers
    int[][] matrix = new int[4][4];

//    Filling the array
    for (int j = 0; j < matrix.length; j++) {  // To make the lines
      for (int i = 0; i < matrix.length; i++) {  // To fill up the row
        if (i == j) {
          matrix[i][j] = 1;
          System.out.print(matrix[i][j] + " ");
        } else {
          matrix[i][j] = 0;
          System.out.print(matrix[i][j] + " ");
        }
      }
      System.out.print("\n");
    }

  }
}
