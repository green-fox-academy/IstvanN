import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HP {

  public static final double BOOK_PRICE = 8;
  public static final double DISCOUNT_2 = 0.95;
  public static final double DISCOUNT_3 = 0.90;
  public static final double DISCOUNT_4 = 0.80;
  public static final double DISCOUNT_5 = 0.75;


//  public static double getPrice(List<Integer> books) {
//    if (allAreTheSame(books)) {
//      return BOOK_PRICE * books.size();
//    }
//    if (books.size() == 2) {
//      if (allAreTheSame(books)) return books.size() * BOOK_PRICE;
//    }
//
//    return 8;
//  }

  private static boolean allAreTheSame(List<Integer> books) {
    if (books.size() == 0) {
      return true;
    }
    Collections.sort(books);
    return books.get(0).equals(books.get(books.size() - 1));
  }

  public static int getPrice(List<Integer> books) {
    int price=0;
    HashMap<Integer, Integer> map = createHashmap(books);
    System.out.println(map);
    while (!map.values().contains(0)) {
      int maxDiscount = maxEligibleDiscount(map);
      System.out.println(maxDiscount);
      takeOnMe(map, maxDiscount);
      System.out.println(map);
    }
    return 0;
  }

  public static HashMap<Integer, Integer> createHashmap(List<Integer> books) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (Integer book : books) {
      Integer count = map.get(book);
      map.put(book, (count == null) ? 1 : count + 1);
    }
    return map;
  }


  public static int maxEligibleDiscount(HashMap<Integer, Integer> map) {
    long result = map.values().stream()
        .filter(v -> v != 0)
        .count();
    return (int) result;
  }

  public static void takeOnMe(HashMap<Integer, Integer> map, int maxEligibleDiscountResult) {
    for (int value : map.values()) {
      if (value != 0W value--;
    }
  }
}
