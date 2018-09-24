import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HPTest {

  List<Integer> books;
  double price;

  @Before
  public void before() {
    books = new ArrayList<>();
    price = 8;
  }

  @Test
  public void testWithZeroBooks() {
    assertEquals(0, HP.getPrice(books), 0);
  }

  @Test
  public void testWithOneBook() {
    books.add(1);
    assertEquals(price, HP.getPrice(books), 0);
  }

  @Test
  public void testWithTwoOfTheSameBook() {
    books.add(1);
    books.add(1);
    assertEquals(price * 2, HP.getPrice(books), 0);
  }

  @Test
  public void testWithThreeOfTheSameBook() {
    books.add(1);
    books.add(1);
    books.add(1);
    assertEquals(price * 3, HP.getPrice(books), 0);
  }

  @Test
  public void testWithFourOfTheSameBook() {
    books.add(1);
    books.add(1);
    books.add(1);
    books.add(1);
    assertEquals(price * 4, HP.getPrice(books), 0);
  }

  @Test
  public void testWithFiveOfTheSameBook() {
    books.add(1);
    books.add(1);
    books.add(1);
    books.add(1);
    books.add(1);
    assertEquals(price * 5, HP.getPrice(books), 0);
  }

  @Test
  public void testWithDifferentBooks() {
    books.add(1);
    books.add(2);
    double expected = price * 2 * 0.95;
    assertEquals(expected, HP.getPrice(books), 0);
  }


//
//  @Test
//  public void testWhenContainsWrongBook() {
//    List<Integer> books = new ArrayList<>();
//    books.add(1);
//    assertEquals(8, HP.getPrice(books));
//  }

}