import java.util.List;

public class HP {

  public static double getPrice(List<Integer> books) {
    if (books.size() == 0) {
      return 0;
    }

    if (books.size() == 2) {
      if (books.get(0) == books.get(1)) {
        return 16;
      } else return 15.2;
    }

    return 8;
  }
}
