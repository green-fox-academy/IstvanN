import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
  public static void main(String[] args) {
    List<Integer> books = new ArrayList<>();
    books.add(1);
    books.add(1);
    books.add(2);
    books.add(2);
    books.add(3);
    books.add(4);
    books.add(5);

    HashMap<Integer,Integer> hpMap=HP.createHashmap(books);
    System.out.println(hpMap);

  }
}
